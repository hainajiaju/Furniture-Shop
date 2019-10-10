package cn.haina.entity;

import java.io.Serializable;

/**
 * sku（商品信息）图片资源(Skuimages)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:04
 */
public class Skuimages implements Serializable {
    //sku图片资源id
    private Integer id;
    //图片资源id
    private Integer imageId;
    //skuid
    private Integer skuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

}