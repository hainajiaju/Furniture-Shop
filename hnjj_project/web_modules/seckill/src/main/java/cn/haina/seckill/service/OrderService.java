package cn.haina.seckill.service;

import cn.haina.dao.OrderDao;
import cn.haina.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class OrderService {

    @Resource
    OrderDao orderDao;

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 判断是否秒杀到某商品，去order里面去查找是否有记录userId和spuId的一条数据。
     * 根据用户userId和spuId判断是否有者条订单记录，有则返回此纪录
     *
     * @param userId
     * @param spuId
     * @return
     */
//    public Order getMiaoshaOrderByUserIdAndCoodsId_Cache(Integer userId, Integer spuId) {
////        1.先去缓存里面取得
//        ValueOperations ops=redisTemplate.opsForValue();
//        Order morder=ops.get(userId+"_"+spuId, Order.class);
//        return morder;
//        //return orderDao.getMiaoshaOrderByUserIdAndCoodsId(userId,goodsId);
//    }

    /**
     * 生成订单
     * @param order
     * @return
     */
    public boolean insert(Integer userId, Order order){
        boolean flag=false;
        if (userId!=null){
            if (orderDao.insert(order)>0){
                flag=true;
            }
        }
        return flag;
    }

//    /**
//     * 生成订单,事务,同时写入到缓存
//     * @param user
//     * @param goodsvo
//     * @return
//     */
//    @Transactional
//    public Order createOrder_Cache(User user, Seckill goodsvo) {
//        //1.生成order_info
//        OrderInfo orderInfo=new OrderInfo();
//        orderInfo.setDeliveryAddrId(0L);//long类型 private Long deliveryAddrId;   L
//        orderInfo.setCreateDate(new Date());
//        orderInfo.setGoodsCount(1);
//        orderInfo.setGoodsId(goodsvo.getId());
//        //秒杀价格
//        orderInfo.setGoodsPrice(goodsvo.getMiaoshaPrice());
//        orderInfo.setOrderChannel(1);
//        //订单状态  ---0-新建未支付  1-已支付  2-已发货  3-已收货
//        orderInfo.setOrderStatus(0);
//        //用户id
//        orderInfo.setUserId(user.getId());
//        //返回orderId
//        long orderId=orderDao.insert(orderInfo);
//        System.out.println("-----orderId:"+orderId);
//
//        OrderInfo orderquery=orderDao.selectorderInfo(user.getId(), goodsvo.getId());
//        long orderIdquery=orderquery.getId();
//        System.out.println("-----orderIdquery:"+orderIdquery);
//
//        //2.生成miaosha_order
//        MiaoshaOrder miaoshaorder =new MiaoshaOrder();
//        miaoshaorder.setGoodsId(goodsvo.getId());
//        //将订单id传给秒杀订单里面的订单orderid
//        miaoshaorder.setOrderId(orderIdquery);
//        miaoshaorder.setUserId(user.getId());
//        orderDao.insertMiaoshaOrder(miaoshaorder);
//        //set(KeyPrefix prefix,String key,T value)   设置缓存数据。
//        redisService.set(OrderKey.getMiaoshaOrderByUidAndGid, ""+user.getId()+"_"+goodsvo.getId(), miaoshaorder);
//        return orderInfo;
//    }
}