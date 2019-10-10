package cn.haina.prodetails.service;

import cn.haina.entity.Shoppingcart;

public interface ShoppingCartService {
    /**
     * 添加购物车
     *
     * @param shoppingcart 实例对象
     * @return 影响行数
     */
    Integer addShoppingCart(Shoppingcart shoppingcart, Integer[] optionids);
}
