package cn.haina.entity;

import java.io.Serializable;
import java.util.List;

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
    //属性选项集合
    private List<Option> optionsList;
    //sku图片集合
    private List<Images> imagesList;

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sortId=" + sortId +
                ", optionsList=" + optionsList +
                ", imagesList=" + imagesList +
                '}';
    }

    public List<Images> getImagesList() {
        return imagesList;
    }

    public void setImagesList(List<Images> imagesList) {
        this.imagesList = imagesList;
    }

    public List<Option> getOptionsList() {
        return optionsList;
    }

    public void setOptionsList(List<Option> optionsList) {
        this.optionsList = optionsList;
    }

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