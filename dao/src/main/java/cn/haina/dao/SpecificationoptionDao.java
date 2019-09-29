package cn.haina.dao;

import cn.haina.entity.Specificationoption;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品规格选项表(Specificationoption)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:18:42
 */
public interface SpecificationoptionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Specificationoption queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Specificationoption> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param specificationoption 实例对象
     * @return 对象列表
     */
    List<Specificationoption> queryAll(Specificationoption specificationoption);

    /**
     * 新增数据
     *
     * @param specificationoption 实例对象
     * @return 影响行数
     */
    int insert(Specificationoption specificationoption);

    /**
     * 修改数据
     *
     * @param specificationoption 实例对象
     * @return 影响行数
     */
    int update(Specificationoption specificationoption);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}