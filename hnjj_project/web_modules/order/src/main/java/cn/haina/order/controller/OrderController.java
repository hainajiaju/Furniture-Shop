package cn.haina.order.controller;

import cn.haina.dao.AddressDao;
import cn.haina.dao.ShoppingcartDao;
import cn.haina.entity.Address;
import cn.haina.entity.Order;
import cn.haina.entity.Shoppingcart;
import cn.haina.entity.skuUtil;
import cn.haina.order.service.ShoppingcartService;
import cn.haina.utils.config.RedisConfig;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class OrderController {
    @Resource
    private AddressDao addressDao;
    @Resource
    RedisTemplate redisTemplate;
    @Resource
    StringRedisTemplate stringRedisTemplate;
    @Resource
    private ShoppingcartDao shoppingcartDao;
    //订单存入集群中
    @GetMapping("/insertOrder")
    public void  insertOrder(Order order){
        String uuid= UUID.randomUUID().toString().replace("-", "").toLowerCase();
        ValueOperations<String,String> vos=stringRedisTemplate.opsForValue();
        ValueOperations vos1=redisTemplate.opsForValue();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
//        String newDate=sdf.format(new Date());
//        String result="";
//        Random random=new Random();
//        for(int i=0;i<4;i++){
//            result+=random.nextInt(10);
//        }
        order.setOrderNo(uuid);
        vos1.set("order",order);
        Order order1=(Order)vos1.get("order");
        System.out.println(order1);
    }
    //查询收货地址
    @GetMapping("/queryAddress")
    public ModelAndView queryAddress(long id){
        Address address=addressDao.queryById(id);
        ModelAndView modelAndView=new ModelAndView();
        if(address!=null){
            modelAndView.addObject(address);
        }else{
            modelAndView.addObject("请选择地址");
        }
        return modelAndView;
    }
    //获取购物车的商品信息
    @RequestMapping("/queryShopping")
    public void query(HttpServletResponse resp) throws IOException {
        List<Shoppingcart> list=shoppingcartDao.AllShoppingcarts(1);
        for (Shoppingcart shoppingcart : list) {
            System.out.println(shoppingcart.getSpu_name());
            List<skuUtil> skuUtils=shoppingcart.getSkulist();
            for (skuUtil sku : skuUtils) {
                System.out.println(sku.getAttributeName()+"+"+sku.getSkuname()+"+"+sku.getPrice());
            }
            shoppingcart.setMoney();
            System.out.println(shoppingcart.getMoney()+"+"+shoppingcart.getNumber());
            System.out.println("-----"+shoppingcart.getMoney()*shoppingcart.getNumber());
            System.out.println("-----"+shoppingcart.getOrderMoney());
            if(shoppingcart.getRepertory_number()==0){
                shoppingcart.setStr("商品没有库存啦！");
            }else if(shoppingcart.getMoney()*shoppingcart.getNumber()>shoppingcart.getOrderMoney()){
                shoppingcart.setStr("商品涨价啦！");
            }else if (shoppingcart.getMoney()*shoppingcart.getNumber()<shoppingcart.getOrderMoney()){
                shoppingcart.setStr("商品降价啦！");
            }else{
                shoppingcart.setStr(" ");
            }
        }
        JSONArray data = (JSONArray) JSONArray.toJSON(list);
        resp.setCharacterEncoding("utf-8");
        PrintWriter respWritter = resp.getWriter();
        respWritter.append(data.toString());
    }
    //获取购物车的商品信息
//    @RequestMapping("/tijiao")
//    public String ajaxList(@RequestParam("list")String shoppingcartList) throws Exception{
//        //jackson对象
//        ObjectMapper mapper = new ObjectMapper();
//        //使用jackson将json转为List<Shoppingcart>
//        JavaType jt = mapper.getTypeFactory().constructParametricType(ArrayList.class, Shoppingcart.class);
//        List<Shoppingcart> list =  (List<Shoppingcart>)mapper.readValue(shoppingcartList, jt);
//        for (Shoppingcart shoppingcart : list) {
//            shoppingcart.setStatus(2);
//            System.out.println( shoppingcart.getId());
//            System.out.println( shoppingcart.getNumber());
//            System.out.println( shoppingcart.getOrderMoney());
//            shoppingcartService.update(shoppingcart);
//        }
//        return "OK";
//    }
}
