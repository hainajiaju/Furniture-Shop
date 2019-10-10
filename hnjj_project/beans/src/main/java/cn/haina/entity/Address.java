package cn.haina.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户地址表(Address)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:16:55
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 501137464671482577L;
    //地址id
    private Long id;
    //用户id
    private Long userId;
    //地址详情
    private String address;
    //联系人电话
    private String phone;
    //区域编码
    private Integer number;
    //备注
    private String text;
    //创建人
    private String createUser;
    //创建时间
    private Date createDate;
    //修改人
    private String updateUser;
    //修改时间
    private Date updateDate;
    //收货人姓名
    private String name;
    //默认
    private Integer defaults;

    private List<Area> Arealist;

    public List<Area> getArealist() {
        return Arealist;
    }

    public void setArealist(List<Area> arealist) {
        Arealist = arealist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefaults() {
        return defaults;
    }

    public void setDefaults(Integer defaults) {
        this.defaults = defaults;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}