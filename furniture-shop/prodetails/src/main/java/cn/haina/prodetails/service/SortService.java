package cn.haina.prodetails.service;

import cn.haina.entity.Sort;

public interface SortService {
    /**
     * 通过spuID查询当前分类和父类的名称
     *
     * @param id 主键
     * @return 实例对象
     */
    Sort queryNameById(Long spuid);
}
