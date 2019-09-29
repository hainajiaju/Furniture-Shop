package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品属性表(Attribute)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:10
 */
public class Attribute implements Serializable {
    private static final long serialVersionUID = 797026765970499798L;
    //属性id
    private Integer id;
    //属性名
    private String name;
    //分类id
    private Long sortId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

}