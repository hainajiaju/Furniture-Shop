package cn.haina.dao;

import cn.haina.entity.Sort;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品分类表(Sort)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:18:10
 */
@Mapper
public interface SortDao {
    /**
     * 通过spuID查询当前分类和父类的名称
     *
     * @param spuid 主键
     * @return 实例对象
     */
    Sort queryNameById(@Param("spuid") Long spuid);
    List<Sort> getSortList(@Param("parentId") int parent_id);
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Sort queryById(Long id);

//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Sort> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param sort 实例对象
//     * @return 对象列表
//     */
//    List<Sort> queryAll(Sort sort);
//
//    /**
//     * 新增数据
//     *
//     * @param sort 实例对象
//     * @return 影响行数
//     */
//    int insert(Sort sort);
//
//    /**
//     * 修改数据
//     *
//     * @param sort 实例对象
//     * @return 影响行数
//     */
//    int update(Sort sort);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 影响行数
//     */
//    int deleteById(Long id);

}