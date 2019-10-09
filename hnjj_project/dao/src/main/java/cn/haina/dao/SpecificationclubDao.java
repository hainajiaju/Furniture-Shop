package cn.haina.dao;//package cn.haina.dao;
//
//import cn.haina.entity.Specificationclub;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import java.util.List;
//
///**
// * 商品规格表(Specificationclub)表数据库访问层
// *
// * @author makejava
// * @since 2019-09-29 11:18:34
// */
//@Mapper
//public interface SpecificationclubDao {
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Specificationclub queryById(Long id);
//
//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Specificationclub> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param specificationclub 实例对象
//     * @return 对象列表
//     */
//    List<Specificationclub> queryAll(Specificationclub specificationclub);
//
//    /**
//     * 新增数据
//     *
//     * @param specificationclub 实例对象
//     * @return 影响行数
//     */
//    int insert(Specificationclub specificationclub);
//
//    /**
//     * 修改数据
//     *
//     * @param specificationclub 实例对象
//     * @return 影响行数
//     */
//    int update(Specificationclub specificationclub);
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