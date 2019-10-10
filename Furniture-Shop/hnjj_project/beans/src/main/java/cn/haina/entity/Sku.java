package cn.haina.entity;

import java.io.Serializable;

/**
 * sku（商品信息）表(Sku)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:58
 */
public class Sku implements Serializable {
    //sku id
    private Integer id;
    //sku名称
    private String name;
    //价格
    private Double price;
    //spuid
    private Integer spuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

}