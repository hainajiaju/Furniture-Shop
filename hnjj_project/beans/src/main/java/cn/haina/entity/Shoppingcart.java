package cn.haina.entity;

import java.io.Serializable;

/**
 * 购物车表(Shoppingcart)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:53
 */
public class Shoppingcart implements Serializable {
    private static final long serialVersionUID = 701332363345777794L;
    //购物车id
    private Long id;
    //spuid
    private Long spuId;
    //数量
    private Integer number;
    //状态
    private Integer status;
    //用户id
    private Long userid;
    //商品总价格s
    private double orderMoney;

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
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