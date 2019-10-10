package cn.haina.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表(Order)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:17:43
 */
@Data
public class Order implements Serializable {
    //订单id
    private Integer id;
    //订单号
    private Integer orderNo;
    //用户id
    private Integer userId;
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
    private Integer addressId;
    //创建人
    private String createUser;
    //创建时间
    private Date createDate;
    //修改人
    private String updateUser;
    //修改时间
    private Date updateDate;
    //订单id
    private Integer orderId;
    //商品id
    private Integer spuId;
    //数量
    private Integer number;

}