package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品规格组表(Specification)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:16
 */
public class Specification implements Serializable {
    private static final long serialVersionUID = -90438763405540112L;
    //规格组id
    private Long id;
    //规格组名
    private String name;
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

    public String getSpecificationclubId() {
        return specificationclubId;
    }

    public void setSpecificationclubId(String specificationclubId) {
        this.specificationclubId = specificationclubId;
    }

}