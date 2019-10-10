package cn.haina.serivce;


import cn.haina.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> userOrders(Long id);

}
