package cn.haina.entity;

import java.io.Serializable;

/**
 * 购物车表(Shoppingcart)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:53
 */
public class Shoppingcart implements Serializable {
    //购物车id
    private Integer id;
    //spuid
    private Integer spuId;
    //数量
    private Integer number;
    //状态
    private Integer status;
    //用户id
    private Integer userid;
    //商品总价格s
    private double orderMoney;

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}