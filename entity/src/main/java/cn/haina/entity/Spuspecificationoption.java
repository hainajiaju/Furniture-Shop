package cn.haina.entity;

import java.io.Serializable;

/**
 * spu（商品信息）规格选项(Spuspecificationoption)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:55
 */
public class Spuspecificationoption implements Serializable {
    private static final long serialVersionUID = -82916071444246141L;
    //spu规格选项id
    private Long id;
    //spuid
    private Long spuId;
    //规格选项id
    private Long specificationoptionId;
    //规格组id
    private Long specificationclubId;
    //规格id
    private Long specificationId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getSpecificationoptionId() {
        return specificationoptionId;
    }

    public void setSpecificationoptionId(Long specificationoptionId) {
        this.specificationoptionId = specificationoptionId;
    }

    public Long getSpecificationclubId() {
        return specificationclubId;
    }

    public void setSpecificationclubId(Long specificationclubId) {
        this.specificationclubId = specificationclubId;
    }

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

}