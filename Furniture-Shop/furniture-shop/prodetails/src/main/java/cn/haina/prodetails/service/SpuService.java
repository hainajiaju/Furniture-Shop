package cn.haina.prodetails.service;

import cn.haina.entity.Spu;

public interface SpuService {
    /**
     * 查询单个商品以及默认图片
     *
     * @param id 主键
     * @return 实例对象
     */
    Spu queryImageById(Integer id);
}
