package cn.haina.beans;

import cn.haina.entity.Spu;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.List;

/**
 * 商品分类表(Sort)实体类
 *
 * @author makejava
 * @since 2019-09-29 11:18:09
 */
@Document(indexName = "jdbc_c",type = "doc",shards = 1,replicas = 0,refreshInterval = "-1")
public class Sorts implements Serializable {
    private static final long serialVersionUID = 754705436807980441L;
    //分类id
    @Id
    private Long id;
    //分类名
    private String name;
    //父级分类
    private Long parentId;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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


}