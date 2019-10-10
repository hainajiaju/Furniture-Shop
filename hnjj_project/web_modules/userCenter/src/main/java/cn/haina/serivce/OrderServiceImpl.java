package cn.haina.serivce;



import cn.haina.dao.OrderDao;
import cn.haina.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;
    @Override
    public List<Order> userOrders(Long id) {
        return orderDao.userOrders(id);
    }
}
