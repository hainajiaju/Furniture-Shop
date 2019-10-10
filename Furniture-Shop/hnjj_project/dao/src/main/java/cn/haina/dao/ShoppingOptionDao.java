package cn.haina.dao;

import cn.haina.entity.Shoppingcart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 购物车表选项表
 *
 * @author makejava
 * @since 2019-09-29 11:17:53
 */
@Mapper
public interface ShoppingOptionDao {
    /**
     * 添加购物车选项数据
     * @param shoppingid
     * @param optionid
     * @return
     */
   Integer addshoppingoption(@Param("shoppingid") Integer shoppingid, @Param("optionid") Integer[] optionid);
}