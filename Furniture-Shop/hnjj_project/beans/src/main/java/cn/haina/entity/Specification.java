package cn.haina.entity;

import java.io.Serializable;

/**
 * 商品规格组表(Specification)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:16
 */
public class Specification implements Serializable {
    //规格组id
    private Integer id;
    //规格组名
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

    @Override
    public String toString() {
        return "Specification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}