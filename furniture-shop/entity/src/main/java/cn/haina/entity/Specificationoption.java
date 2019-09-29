package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品规格选项表(Specificationoption)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:42
 */
public class Specificationoption implements Serializable {
    private static final long serialVersionUID = -21191510844850469L;
    //规格选项
    private Long id;
    //规格选项名
    private String name;
    //规格id
    private String specificationId;
    //规格组id
    private String specificationclubId;


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

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public String getSpecificationclubId() {
        return specificationclubId;
    }

    public void setSpecificationclubId(String specificationclubId) {
        this.specificationclubId = specificationclubId;
    }

}