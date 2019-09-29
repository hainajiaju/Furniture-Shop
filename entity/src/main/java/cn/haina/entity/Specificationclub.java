package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品规格表(Specificationclub)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:34
 */
public class Specificationclub implements Serializable {
    private static final long serialVersionUID = -23048501794551200L;
    //规格id
    private Long id;
    //规格名字
    private String name;
    //分类id
    private Long sortId;


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

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

}