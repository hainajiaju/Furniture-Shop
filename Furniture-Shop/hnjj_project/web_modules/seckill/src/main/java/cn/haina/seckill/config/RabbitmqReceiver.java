package cn.haina.seckill.config;

import cn.haina.entity.Order;
import cn.haina.entity.Seckill;
import cn.haina.entity.User;
import cn.haina.seckill.service.OrderService;
import cn.haina.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class RabbitmqReceiver {
    private static Logger log= LoggerFactory.getLogger(RabbitmqReceiver.class);
    @Autowired
    SeckillService seckillService;

    @Autowired
    OrderService orderService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @RabbitListener(queues=RabbitmqConfig.MIAOSHA_QUEUE)//指明监听的是哪一个queue
    public void receiveMiaosha(String message) {
        log.info("receiveMiaosha message:"+message);
        //拿到了秒杀信息之后  开始业务逻辑秒杀，
//        ValueOperations ops=redisTemplate.opsForValue();
//        MiaoshaMessage mm=ops.get(message, MiaoshaMessage.class);
//        User user=mm.getUser();
//        Integer goodsId=mm.getSpuId();
//        Seckill seckill=SeckillService.getById(goodsId);
//        int  stockcount=seckill.getNumber();
//        //1.判断库存不足
//        if(stockcount<=0) {//失败
//            return;
//        }
        //2.判断这个秒杀订单形成没有，判断是否已经秒杀到了，避免一个账户秒杀多个商品
//        Order order = orderService.getMiaoshaOrderByUserIdAndCoodsId(user.getId(), goodsId);
//        if (order != null) {// 重复下单
//            // model.addAttribute("errorMessage", CodeMsg.REPEATE_MIAOSHA);
//            return;
//        }
        //原子操作：1.库存减1，2.下订单，3.写入秒杀订单--->是一个事务
//        seckillService.updateCount1(user,goodsvo);

    }
}
