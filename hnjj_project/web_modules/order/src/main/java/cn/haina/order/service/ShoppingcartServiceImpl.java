package cn.haina.order.service;

import cn.haina.dao.ShoppingcartDao;
import cn.haina.entity.Shoppingcart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShoppingcartServiceImpl implements ShoppingcartService {
    @Resource
    private ShoppingcartDao shoppingcartDao;
    public List<Shoppingcart> AllShoppingcarts(Integer id) {
        return shoppingcartDao.AllShoppingcarts(id);
    }

    public int update(Shoppingcart shoppingcart) {
      return shoppingcartDao.update(shoppingcart);
    }
}
