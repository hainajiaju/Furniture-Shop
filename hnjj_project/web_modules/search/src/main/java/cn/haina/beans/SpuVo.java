package cn.haina.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * sku（商品）表(Spu)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:47
 */
@Document(indexName = "jdbc_spu",type = "doc",shards = 1,replicas = 0,refreshInterval = "-1")
public class SpuVo implements Serializable {
    private static final long serialVersionUID = 650985361458638283L;
    //SPU id
    @Id
    private Integer id;
    //spu名称
    private String spu_name;
    //库存数
    private Integer repertory_number;
    //销量
    private Integer sales_number;
    //市场价
    private Double market_price;
    //原价
    private Double original_price;
    //上架时间
    private Date upload_time;
    //下架时间
    private Date under_time;
    //删除状态（ 0：已删除  1：未删除）
    private Integer del_status;
    //分类id
    private Integer sort_id;
    //创建人
    private String create_user;
    //创建时间
    private Date create_date;
    //修改人
    private String update_user;
    //修改时间
    private Date update_date;
    //默认图片
    private String big_image;
    private Long sortId;

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpu_name() {
        return spu_name;
    }

    public void setSpu_name(String spu_name) {
        this.spu_name = spu_name;
    }

    public Integer getRepertory_number() {
        return repertory_number;
    }

    public void setRepertory_number(Integer repertory_number) {
        this.repertory_number = repertory_number;
    }

    public Integer getSales_number() {
        return sales_number;
    }

    public void setSales_number(Integer sales_number) {
        this.sales_number = sales_number;
    }

    public Double getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Double market_price) {
        this.market_price = market_price;
    }

    public Double getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Double original_price) {
        this.original_price = original_price;
    }

    public Date getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Date upload_time) {
        this.upload_time = upload_time;
    }

    public Date getUnder_time() {
        return under_time;
    }

    public void setUnder_time(Date under_time) {
        this.under_time = under_time;
    }

    public Integer getDel_status() {
        return del_status;
    }

    public void setDel_status(Integer del_status) {
        this.del_status = del_status;
    }

    public Integer getSort_id() {
        return sort_id;
    }

    public void setSort_id(Integer sort_id) {
        this.sort_id = sort_id;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getBig_image() {
        return big_image;
    }

    public void setBig_image(String big_image) {
        this.big_image = big_image;
    }
}