package cn.haina.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:43
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -12878991436788442L;
    //订单id
    private Long id;
    //订单号
    private Integer orderNo;
    //用户id
    private Long userId;
    //订单状态（ 0：未支付  1：已支付  2：已取消   ）
    private Integer status;
    //支付方式（ 0：支付宝支付  1：微信支付 ）
    private Integer orderPay;
    //订单金额
    private Double orderMoney;
    //付款金额
    private Double payMoney;
    //交易订单号（支付宝、微信）
    private Integer alipayNumber;
    //备注
    private String content;
    //配送方式
    private String dispatching;
    //地址id
    private Long addressId;
    //创建人
    private String createUser;
    //创建时间
    private Date createDate;
    //修改人
    private String updateUser;
    //修改时间
    private Date updateDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(Integer orderPay) {
        this.orderPay = orderPay;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getAlipayNumber() {
        return alipayNumber;
    }

    public void setAlipayNumber(Integer alipayNumber) {
        this.alipayNumber = alipayNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDispatching() {
        return dispatching;
    }

    public void setDispatching(String dispatching) {
        this.dispatching = dispatching;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
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