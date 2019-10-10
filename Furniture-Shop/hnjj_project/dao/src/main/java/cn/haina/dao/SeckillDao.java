package cn.haina.dao;

import cn.haina.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//import cn.haina.entity.vo.SpuSeckillVo;

/**
 * 秒杀表(Seckill)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-02 22:36:44
 */
@Mapper
public interface SeckillDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Seckill queryById(@Param("id") Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Seckill> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param seckill 实例对象
     * @return 对象列表
     */
    List<Seckill> queryAll(Seckill seckill);

    /**
     * 新增数据
     *
     * @param seckill 实例对象
     * @return 影响行数
     */
    int insert(Seckill seckill);

    /**
     * 修改数据
     *
     * @param seckill 实例对象
     * @return 影响行数
     */
    int update(Seckill seckill);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 防止商品超卖
     * @param seckill
     */
    @Update("update seckill set number=number-1 where spu_id=#{spuId} and number>0")
    void updateCount(Seckill seckill);

    /**
     * 秒杀失败
     *
     * @param seckill
     */
    @Update("update seckill set number=number-1 where spu_id=#{spuId} and number>0")
    int updateCount1(Seckill seckill);

    /**
     * 查询所有商品信息
     *
     * @return
     */
    List<Seckill> selectAll();

    /**
     * 根据商品id查询
     *
     * @param spuId
     * @return
     */
    Seckill getBySpuId(@Param("spuId") Integer spuId);

}