package cn.haina.entity;

import java.io.Serializable;

/**
 * sku（商品信息）表(Sku)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:58
 */
public class Sku implements Serializable {
    private static final long serialVersionUID = 342689022478086825L;
    //sku id
    private Long id;
    //sku名称
    private String name;
    //价格
    private Double price;
    //spuid
    private Long spuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

}