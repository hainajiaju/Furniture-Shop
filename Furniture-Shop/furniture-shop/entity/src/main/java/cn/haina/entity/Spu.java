package cn.haina.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * sku（商品）表(Spu)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:47
 */
public class Spu implements Serializable {
    private static final long serialVersionUID = 650985361458638283L;
    //SPU id
    private Integer id;
    //spu名称
    private String spuName;
    //库存数
    private Integer repertoryNumber;
    //销量
    private Integer salesNumber;
    //市场价
    private Double marketPrice;
    //原价
    private Double originalPrice;
    //上架时间
    private Date uploadTime;
    //下架时间
    private Date underTime;
    //删除状态（ 0：已删除  1：未删除）
    private Integer delStatus;
    //分类id
    private Integer sortId;
    //创建人
    private String createUser;
    //创建时间
    private Date createDate;
    //修改人
    private String updateUser;
    //修改时间
    private Date updateDate;
    //默认图片
    private String defaultImg;

    public String getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(String defaultImg) {
        this.defaultImg = defaultImg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public Integer getRepertoryNumber() {
        return repertoryNumber;
    }

    public void setRepertoryNumber(Integer repertoryNumber) {
        this.repertoryNumber = repertoryNumber;
    }

    public Integer getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(Integer salesNumber) {
        this.salesNumber = salesNumber;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getUnderTime() {
        return underTime;
    }

    public void setUnderTime(Date underTime) {
        this.underTime = underTime;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
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

    @Override
    public String toString() {
        return "Spu{" +
                "id=" + id +
                ", spuName='" + spuName + '\'' +
                ", repertoryNumber=" + repertoryNumber +
                ", salesNumber=" + salesNumber +
                ", marketPrice=" + marketPrice +
                ", originalPrice=" + originalPrice +
                ", uploadTime=" + uploadTime +
                ", underTime=" + underTime +
                ", delStatus=" + delStatus +
                ", sortId=" + sortId +
                ", createUser='" + createUser + '\'' +
                ", createDate=" + createDate +
                ", updateUser='" + updateUser + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}