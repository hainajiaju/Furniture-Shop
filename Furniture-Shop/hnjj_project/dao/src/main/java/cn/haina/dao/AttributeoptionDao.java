package cn.haina.dao;//package cn.haina.dao;
//
//import cn.haina.entity.Attributeoption;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import java.util.List;
//
///**
// * 商品属性选项表(Attributeoption)表数据库访问层
// *
// * @author makejava
// * @since 2019-09-29 11:17:16
// */
//@Mapper
//public interface AttributeoptionDao {
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Attributeoption queryById(Long id);
//
//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Attributeoption> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param attributeoption 实例对象
//     * @return 对象列表
//     */
//    List<Attributeoption> queryAll(Attributeoption attributeoption);
//
//    /**
//     * 新增数据
//     *
//     * @param attributeoption 实例对象
//     * @return 影响行数
//     */
//    int insert(Attributeoption attributeoption);
//
//    /**
//     * 修改数据
//     *
//     * @param attributeoption 实例对象
//     * @return 影响行数
//     */
//    int update(Attributeoption attributeoption);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 影响行数
//     */
//    int deleteById(Long id);
//
//}