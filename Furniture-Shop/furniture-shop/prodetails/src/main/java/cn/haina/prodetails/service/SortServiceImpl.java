package cn.haina.prodetails.service;

import cn.haina.dao.SortDao;
import cn.haina.entity.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SortServiceImpl implements SortService {
    @Resource
    private SortDao sortDao;
    @Override
    /**
     * 通过spuID查询当前分类和父类的名称
     */
    public Sort queryNameById(Long spuid) {
        return sortDao.queryNameById(spuid);
    }
}
