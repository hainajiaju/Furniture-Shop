package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品属性选项表(Attributeoption)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:16
 */
public class Attributeoption implements Serializable {
    private static final long serialVersionUID = -90390144947071962L;
    //属性选项id
    private Long id;
    //选项id
    private Long optionId;
    //属性id
    private Long attributeId;
    //skuid
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}