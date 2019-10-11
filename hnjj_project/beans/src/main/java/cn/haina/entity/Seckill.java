package cn.haina.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀表(Seckill)实体类
 *
 * @author makejava
 * @since 2019-10-02 22:36:44
 */
@Data
public class Seckill implements Serializable {
    //秒杀id
    private Integer id;
    //spu id
    private Integer spuId;
    //秒杀价
    private Double price;
    //秒杀数量
    private Integer number;
    //开始时间
    private Date beginDate;
    //结束时间
    private Date endDate;
    //描述
    private String content;
    //spu名称
    private String spuName;
    //库存数
    private Integer repertoryNumber;
    //原价
    private Double originalPrice;
}