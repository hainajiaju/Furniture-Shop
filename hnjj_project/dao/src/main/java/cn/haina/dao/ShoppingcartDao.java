package cn.haina.dao;

import cn.haina.entity.Shoppingcart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 购物车表(Shoppingcart)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:17:53
 */
@Mapper
public interface ShoppingcartDao {
    /**
     * 根据用户id查询购物车详细信息
     */
    List<Shoppingcart> AllShoppingcarts(@Param("id") Integer id);
    /**
     * 修改数据
     *
     * * @param shoppingcart 实例对象
     * @return 影响行数
     */
    int update(Shoppingcart shoppingcart);
//     /**
//     * 添加购物车并返回主键
//     *
//     * @param shoppingcart 实例对象
//     * @return 影响行数
//     */
//    Integer addShoppingCart(Shoppingcart shoppingcart);

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Shoppingcart queryById(Long id);
//
//    /**
//     * 查询指定行数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Shoppingcart> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param shoppingcart 实例对象
//     * @return 对象列表
//     */
//    List<Shoppingcart> queryAll(Shoppingcart shoppingcart);
//
//    /**
//     * 新增数据
//     *
//     * @param shoppingcart 实例对象
//     * @return 影响行数
//     */
//    int insert(Shoppingcart shoppingcart);
//
//    /**
//     * 修改数据
//     *
//     * @param shoppingcart 实例对象
//     * @return 影响行数
//     */
//    int update(Shoppingcart shoppingcart);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 影响行数
//     */
//    int deleteById(Long id);

}