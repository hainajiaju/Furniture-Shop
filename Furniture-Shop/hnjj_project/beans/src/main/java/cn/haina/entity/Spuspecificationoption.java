package cn.haina.entity;

import java.io.Serializable;

/**
 * spu（商品信息）规格选项(Spuspecificationoption)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:55
 */
public class Spuspecificationoption implements Serializable {
    //spu规格选项id
    private Integer id;
    //spuid
    private Integer spuId;
    //规格选项id
    private Integer specificationoptionId;
    //规格组id
    private Integer specificationclubId;
    //规格id
    private Integer specificationId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getSpecificationoptionId() {
        return specificationoptionId;
    }

    public void setSpecificationoptionId(Integer specificationoptionId) {
        this.specificationoptionId = specificationoptionId;
    }

    public Integer getSpecificationclubId() {
        return specificationclubId;
    }

    public void setSpecificationclubId(Integer specificationclubId) {
        this.specificationclubId = specificationclubId;
    }

    public Integer getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Integer specificationId) {
        this.specificationId = specificationId;
    }

}