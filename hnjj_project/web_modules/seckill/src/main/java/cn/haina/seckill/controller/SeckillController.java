package cn.haina.seckill.controller;

import cn.haina.entity.Seckill;
import cn.haina.entity.User;
import cn.haina.seckill.config.RabbitmqSender;
import cn.haina.seckill.service.OrderService;
import cn.haina.seckill.service.SeckillService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 秒杀表(Seckill)表控制层
 *
 * @author makejava
 * @since 2019-10-02 22:36:44
 */
@Controller
@RequestMapping("/seckill")
public class SeckillController {

    @Autowired
    SeckillService seckillService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RabbitmqSender rabbitmqSender;

    @Autowired
    OrderService orderService;

    /**
     * 获取秒杀商品id
     * @param model
     * @param user
     * @param spuId
     * @return
     */
    @RequestMapping("/shangpin/{spuId}")
    public String toDetail(Model model, User user, @PathVariable("spuId")Integer spuId){
        model.addAttribute("user", user);
        Seckill goods=seckillService.getById(spuId);
        model.addAttribute("goods", goods);
        System.err.println(goods.getOriginalPrice());
        //传入秒杀开始时间，结束时间等信息
        long start=goods.getBeginDate().getTime();
        long end=goods.getEndDate().getTime();
        long now=System.currentTimeMillis();
        //秒杀状态量
        int status=0;
        //开始时间倒计时
        int remailSeconds=0;
        if(now<start) {
            status=0;
            //毫秒转为秒
            remailSeconds=(int) ((start-now)/1000);
            //秒杀已经结束
        }else if(now>end){
            status=2;
            remailSeconds=-1;
            //秒杀正在进行
        }else {
            status=1;
            //毫秒转为秒
            remailSeconds=0;
        }
        model.addAttribute("status", status);
        model.addAttribute("remailSeconds", remailSeconds);
        //返回页面login
        return "miaoshatime";
    }

    /**
     * 存入redis
     * @param spuId
     * @return
     */

    @RequestMapping("/miaosha")
    public String miaosha(Integer spuId){
        ValueOperations ops=redisTemplate.opsForValue();
        Seckill seckill = seckillService.getById(spuId);
        ops.set("SPU",JSON.toJSONStringWithDateFormat(seckill,"yyyy-MM-dd HH:mm:ss",SerializerFeature.WriteDateUseDateFormat));
        Object spuId1 = ops.get("SPU");
        System.out.println(spuId1);
        return "hello";
    }
//
//    @RequestMapping("/miaosha")
//    public Result<String> miaosha(User user,Integer spuId){
//        if (user==null){
//            return Result.error(CodeMsg.SESSION_ERROR);
//        }else{
//            ValueOperations ops=redisTemplate.opsForValue();
//            Object spu = ops.get("SPU");
//            System.out.println(spu);
////            spu.getSpuName();
////            Order order=new Order();
////            orderService.insert(1,order);
//        }
//
//        return Result.success("生成订单");
//    }

//    /**
//     *
//     * @param model
//     * @param user
//     * @param goodsId
//     * @param path
//     * @return
//     */
//    @RequestMapping(value="hello",method=RequestMethod.POST)
//    @ResponseBody
//    public Result<Integer> doMiaoshaCache(Model model,User user,
//                                          @RequestParam(value="spuId",defaultValue="0") Integer goodsId,
//                                          @PathVariable("path")String path) {
//        model.addAttribute("user", user);
//        //1.如果用户为空，则返回至登录页面
//        if(user==null){
//            return Result.error(CodeMsg.SESSION_ERROR);
//        }
//        //验证path,去redis里面取出来然后验证。
//
//        boolean check=miaoshaService.checkPath(user,goodsId,path);
//        if(!check) {
//            return Result.error(CodeMsg.REQUEST_ILLEAGAL);
//        }
//
//        //内存标记，减少对redis的访问 localMap.put(goodsId,false);
//		boolean over=localMap.get(goodsId);
//		//在容量满的时候，那么就打标记为true
//		if(over) {
//			return Result.error(CodeMsg.MIAOSHA_OVER_ERROR);
//		}
//        //2.预减少库存，减少redis里面的库存
//
//        long stock=redisTemplate.decr(GoodsKey.getMiaoshaGoodsStock,""+goodsId);
//
//        //3.判断减少数量1之后的stock，区别于查数据库时候的stock<=0
//        /*if(stock<0) {
//            return Result.error(CodeMsg.MIAOSHA_OVER_ERROR);
//        }*/
//        //4.判断这个秒杀订单形成没有，判断是否已经秒杀到了，避免一个账户秒杀多个商品
//        Order order = orderService.getMiaoshaOrderByUserIdAndCoodsId(user.getId(), goodsId);
//        if (order != null) {// 重复下单
//           return Result.error(CodeMsg.REPEATE_MIAOSHA);
//        }
//        //5.正常请求，入队，发送一个秒杀message到队列里面去，入队之后客户端应该进行轮询。
//        MiaoshaMessage mms=new MiaoshaMessage();
//        mms.setUser(user);
//        mms.setSpuId(goodsId);
//        rabbitmqSender.sendMiaoshaMessage(mms);
//        //返回0代表排队中
//        return Result.success(0);
//    }
}