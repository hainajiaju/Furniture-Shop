package cn.haina.prodetails.service;

import cn.haina.dao.SpuDao;
import cn.haina.entity.Spu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SpuServiceImpl implements SpuService {
    @Resource
    private SpuDao spuDao;
    @Override
    /**
     * 查询单个商品以及默认图片
     */
    public Spu queryImageById(Integer id) {
        return spuDao.queryImageById(id);
    }
}
