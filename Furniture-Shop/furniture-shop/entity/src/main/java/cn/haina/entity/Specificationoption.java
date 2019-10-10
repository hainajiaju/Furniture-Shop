package cn.haina.entity;

import java.io.Serializable;
import java.util.List;

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
    //规格id
    private Long specificationId;
    //规格组id
    private Long specificationclubId;
    //规格组名称
    private String specificationclubName;
    //规格集合
    private List<Specification> specificationList;

    public String getSpecificationclubName() {
        return specificationclubName;
    }

    public void setSpecificationclubName(String specificationclubName) {
        this.specificationclubName = specificationclubName;
    }

    public List<Specification> getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(List<Specification> specificationList) {
        this.specificationList = specificationList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

    public Long getSpecificationclubId() {
        return specificationclubId;
    }

    public void setSpecificationclubId(Long specificationclubId) {
        this.specificationclubId = specificationclubId;
    }

    @Override
    public String toString() {
        return "Specificationoption{" +
                "id=" + id +
                ", specificationId=" + specificationId +
                ", specificationclubId=" + specificationclubId +
                ", specificationclubName='" + specificationclubName + '\'' +
                ", specificationList=" + specificationList +
                '}';
    }
}