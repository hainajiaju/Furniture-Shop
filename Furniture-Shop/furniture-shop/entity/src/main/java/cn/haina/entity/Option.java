package cn.haina.entity;

import java.io.Serializable;

/**
 * 选项表(Option)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:38
 */
public class Option implements Serializable {
    private static final long serialVersionUID = -36556730053460864L;
    //选项id
    private Long id;
    //选项名
    private String name;
    //属性id
    private Long attributeId;
    //当前选项价格
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attributeId=" + attributeId +
                ", price=" + price +
                '}';
    }
}