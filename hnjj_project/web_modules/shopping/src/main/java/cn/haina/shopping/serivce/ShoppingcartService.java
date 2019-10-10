package cn.haina.shopping.serivce;

import cn.haina.entity.Shoppingcart;

import java.util.List;

public interface ShoppingcartService {

    List<Shoppingcart> AllShoppingcarts(Integer id);
    int update(Shoppingcart shoppingcart);
}
