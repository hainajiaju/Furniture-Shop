package cn.haina.utils;

/**
 * 购物车传参类
 */
public class ShoppingCartParamUtil {
    private Integer spuid;
    private Integer number;
    private Integer[] optionids;
    private double orderMoney;

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getSpuid() {
        return spuid;
    }

    public void setSpuid(Integer spuid) {
        this.spuid = spuid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer[] getOptionids() {
        return optionids;
    }

    public void setOptionids(Integer[] optionids) {
        this.optionids = optionids;
    }
}
