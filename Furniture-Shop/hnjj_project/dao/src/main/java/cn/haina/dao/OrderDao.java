package cn.haina.dao;

import cn.haina.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 订单表(Order)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-29 11:17:43
 */
@Mapper
public interface OrderDao {

    /**
     * 查询当前用户的订单
     * @param userId
     * @param spuId
     * @return
     */
    @Select("select * from `order` o,`orderdetails` s where o.id=s.order_id and o.user_id=#{userId} and s.spu_id=#{spuId}")
    Order getByUserAndSpu(@Param("userId")Integer userId,@Param("spuId")Integer spuId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Order> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param order 实例对象
     * @return 对象列表
     */
    List<Order> queryAll(Order order);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}