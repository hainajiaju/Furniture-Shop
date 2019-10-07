package cn.haina.prodetails.service;

import cn.haina.dao.ShoppingOptionDao;
import cn.haina.dao.ShoppingcartDao;
import cn.haina.entity.Shoppingcart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Resource
    private ShoppingcartDao shoppingcartDao;
    @Resource
    private ShoppingOptionDao shoppingOptionDao;
    @Override
    /**
     * 添加购物车
     */
    public Integer addShoppingCart(Shoppingcart shoppingcart,Integer[] optionids) {
        Integer shoppingcartid = shoppingcartDao.addShoppingCart(shoppingcart);
        if(shoppingcartid==1){
            Integer num = shoppingOptionDao.addshoppingoption(shoppingcart.getId(), optionids);
            if(num == optionids.length){
                return 1;
            }else{
                return -1;
            }
        }else{
            return 0;
        }
    }
}
