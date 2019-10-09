package cn.haina.entity;

import java.io.Serializable;

/**
 * sku（商品信息）图片资源(Skuimages)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:04
 */
public class Skuimages implements Serializable {
    private static final long serialVersionUID = 265424276499569819L;
    //sku图片资源id
    private Long id;
    //图片资源id
    private Long imageId;
    //skuid
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}