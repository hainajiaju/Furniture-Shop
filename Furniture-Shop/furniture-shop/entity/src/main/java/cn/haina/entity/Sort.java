package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品分类表(Sort)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:09
 */
public class Sort implements Serializable {
    private static final long serialVersionUID = 754705436807980441L;
    //分类id
    private Long id;
    //分类名
    private String name;
    //父级分类
    private Long parentId;
    //父级名称
    private String parentName;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

}