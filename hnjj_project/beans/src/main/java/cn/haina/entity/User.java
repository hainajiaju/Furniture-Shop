package cn.haina.entity;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:19:01
 */
public class User implements Serializable {
    private static final long serialVersionUID = 519274003494717737L;
    //用户id
    private Long id;
    //账号或手机号码
    private String name;
    //密码
    private String password;
    //昵称
    private String nicheng;
    //头像
    private String touxiang;
    //区域id
    private Long areaId;
    //用户类型（ 0：管理员  1：用户）
    private Integer type;
    //是否存在
    private Integer extiis;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNicheng() {
        return nicheng;
    }

    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getExtiis() {
        return extiis;
    }

    public void setExtiis(Integer extiis) {
        this.extiis = extiis;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nicheng='" + nicheng + '\'' +
                ", touxiang='" + touxiang + '\'' +
                ", areaId=" + areaId +
                ", type=" + type +
                ", extiis=" + extiis +
                '}';
    }
}