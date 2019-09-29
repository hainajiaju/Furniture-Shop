package cn.haina.entity;

import java.io.Serializable;

/**
 * 图片资源表(Images)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:33
 */
public class Images implements Serializable {
    private static final long serialVersionUID = -77408550626800631L;
    //图片资源id
    private Long id;
    //大图
    private String bigImage;
    //中图
    private String centerImage;
    //小图
    private String smallImage;
    //spuid
    private Long spuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getCenterImage() {
        return centerImage;
    }

    public void setCenterImage(String centerImage) {
        this.centerImage = centerImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

}