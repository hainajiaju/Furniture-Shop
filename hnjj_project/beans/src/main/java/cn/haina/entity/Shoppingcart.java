package cn.haina.entity;

import java.io.Serializable;
import java.util.List;

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

    //需求数
    //商品名称
    private String spu_name;
    //商品单价
    private Double original_price;
    //商品金额
    private Double money;
   //总价
    private Double orderMoney;
    //属性
    //库存数量
    private Integer repertory_number;
    //商品信息
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getRepertory_number() {
        return repertory_number;
    }

    public void setRepertory_number(Integer repertory_number) {
        this.repertory_number = repertory_number;
    }

    private List<skuUtil> skulist;
    public void setMoney(){
        money=original_price;
        for (skuUtil skuUtil1 : skulist) {
            money+=skuUtil1.getPrice();
        }
    }
    public List<skuUtil> getSkulist() {
        return skulist;
    }

    public void setSkulist(List<skuUtil> skulist) {
        this.skulist = skulist;
    }

    public String getSpu_name() {
        return spu_name;
    }

    public void setSpu_name(String spu_name) {
        this.spu_name = spu_name;
    }

    public Double getPrice() {
        return original_price;
    }

    public void setPrice(Double price) {
        this.original_price = price;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

  public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
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