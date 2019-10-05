//package cn.haina.dao;
//
//import cn.haina.entity.Imagedetails;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import java.util.List;
//
///**
// * 图片详情表(Imagedetails)表数据库访问层
// *
// * @author makejava
// * @since 2019-09-29 11:17:28
// */
//@Mapper
//public interface ImagedetailsDao {
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Imagedetails queryById(Long id);
//
//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Imagedetails> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param imagedetails 实例对象
//     * @return 对象列表
//     */
//    List<Imagedetails> queryAll(Imagedetails imagedetails);
//
//    /**
//     * 新增数据
//     *
//     * @param imagedetails 实例对象
//     * @return 影响行数
//     */
//    int insert(Imagedetails imagedetails);
//
//    /**
//     * 修改数据
//     *
//     * @param imagedetails 实例对象
//     * @return 影响行数
//     */
//    int update(Imagedetails imagedetails);
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