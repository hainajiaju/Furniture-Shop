package cn.haina.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 图片详情表(Imagedetails)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:28
 */
public class Imagedetails implements Serializable {
    //图片详情id
    private Integer id;
    //大图
    private String bigImage;
    //中图
    private String centreImage;
    //小图
    private String smallImage;
    //spu id
    private Integer spuId;
    //创建人
    private String createUser;
    //创建时间
    private Date createDate;
    //修改人
    private String updateUser;
    //修改时间
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getCentreImage() {
        return centreImage;
    }

    public void setCentreImage(String centreImage) {
        this.centreImage = centreImage;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}