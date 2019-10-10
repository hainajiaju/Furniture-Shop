package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品属性选项表(Attributeoption)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:16
 */
public class Attributeoption implements Serializable {
    //属性选项id
    private Integer id;
    //选项id
    private Integer optionId;
    //属性id
    private Integer attributeId;
    //skuid
    private Integer skuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

}