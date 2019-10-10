package cn.haina.seckill.service;

import cn.haina.dao.SeckillDao;
import cn.haina.entity.Seckill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * 秒杀表(Seckill)表服务实现类
 * @author yican
 * @since 2019-10-02 22:36:44
 */
@Service
@Transactional
public class SeckillService {
    @Resource
    SeckillDao seckillDao;

    /**
     * 查询所有商品信息
     *
     * @return
     */
    public List<Seckill> SelectAll() {
        return seckillDao.selectAll();
    }

    /**
     * 根据商品id查询所有商品信息（关联秒杀表）
     *
     * @param spuId
     * @return
     */
    public  Seckill getById(Integer spuId) {
        return seckillDao.getBySpuId(spuId);
    }

    /**
     * 防止超卖
     *
     * @param spuSeckillVo
     */
    public void updateCount(Seckill spuSeckillVo) {
        Seckill seckill = new Seckill();
        seckill.setSpuId(spuSeckillVo.getId());
        seckillDao.updateCount(seckill);
    }

    /**
     * 考虑有可能下单失败的情况,下单失败那么就不去
     *
     * @param spuSeckillVo
     * @return
     */
    public boolean updateCount1(Seckill spuSeckillVo) {
        Seckill seckill = new Seckill();
        seckill.setSpuId(spuSeckillVo.getId());
        int i = seckillDao.updateCount1(seckill);
        System.out.println("下单数量:" + seckill);
        return i > 0;
    }

    /**
     * 缓存预热  将秒杀商品添加到redis中
     * @param seckill
     * @return
     */
    public boolean insert(Seckill seckill){
        boolean flag=false;
        if (seckillDao.insert(seckill)>0){
            flag=true;
        }
        return flag;
    }

}