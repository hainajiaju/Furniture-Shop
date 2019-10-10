package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品规格表(Specificationclub)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:34
 */
public class Specificationclub implements Serializable {
    //规格id
    private Integer id;
    //规格名字
    private String name;

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
}