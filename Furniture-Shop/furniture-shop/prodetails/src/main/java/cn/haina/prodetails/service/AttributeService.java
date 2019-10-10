package cn.haina.prodetails.service;

import cn.haina.entity.Attribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttributeService {
    /**
     * 通过商品ID查询属性和属性下的选项数据以及每个选项对应图片
     *
     * @param id
     * @return 实例对象
     */
    List<Attribute> queryAllBySortId(@Param("id") Integer id);
}
