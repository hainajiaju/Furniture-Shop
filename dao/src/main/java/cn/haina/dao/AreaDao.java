package cn.haina.dao;

import cn.haina.entity.Area;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 地址区域表(Area)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:17:03
 */
public interface AreaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Area queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Area> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param area 实例对象
     * @return 对象列表
     */
    List<Area> queryAll(Area area);

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 影响行数
     */
    int insert(Area area);

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 影响行数
     */
    int update(Area area);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}