package cn.haina.dao;

import cn.haina.entity.Attribute;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品属性表(Attribute)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:17:10
 */
public interface AttributeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Attribute queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Attribute> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attribute 实例对象
     * @return 对象列表
     */
    List<Attribute> queryAll(Attribute attribute);

    /**
     * 新增数据
     *
     * @param attribute 实例对象
     * @return 影响行数
     */
    int insert(Attribute attribute);

    /**
     * 修改数据
     *
     * @param attribute 实例对象
     * @return 影响行数
     */
    int update(Attribute attribute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}