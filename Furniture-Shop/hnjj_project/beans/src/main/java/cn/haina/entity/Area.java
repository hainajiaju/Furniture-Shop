package cn.haina.entity;

import java.io.Serializable;

/**
 * 地址区域表(Area)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:03
 */
public class Area implements Serializable {
    //区域id
    private Integer id;
    //区域名
    private String areaName;
    //区域类型（ 0：市  1：省  2：区或县）
    private Integer areaType;
    //父类id
    private Integer parentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}