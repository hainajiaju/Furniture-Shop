package cn.haina.dao;

import cn.haina.entity.Skuimages;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * sku（商品信息）图片资源(Skuimages)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:18:04
 */
public interface SkuimagesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Skuimages queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Skuimages> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param skuimages 实例对象
     * @return 对象列表
     */
    List<Skuimages> queryAll(Skuimages skuimages);

    /**
     * 新增数据
     *
     * @param skuimages 实例对象
     * @return 影响行数
     */
    int insert(Skuimages skuimages);

    /**
     * 修改数据
     *
     * @param skuimages 实例对象
     * @return 影响行数
     */
    int update(Skuimages skuimages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}