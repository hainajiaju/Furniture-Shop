package cn.haina.dao;//package cn.haina.dao;
//
//import cn.haina.entity.Specification;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import java.util.List;
//
///**
// * 商品规格组表(Specification)表数据库访问层
// *
// * @author makejava
// * @since 2019-09-29 11:18:16
// */
//@Mapper
//public interface SpecificationDao {
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Specification queryById(Long id);
//
//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Specification> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param specification 实例对象
//     * @return 对象列表
//     */
//    List<Specification> queryAll(Specification specification);
//
//    /**
//     * 新增数据
//     *
//     * @param specification 实例对象
//     * @return 影响行数
//     */
//    int insert(Specification specification);
//
//    /**
//     * 修改数据
//     *
//     * @param specification 实例对象
//     * @return 影响行数
//     */
//    int update(Specification specification);
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