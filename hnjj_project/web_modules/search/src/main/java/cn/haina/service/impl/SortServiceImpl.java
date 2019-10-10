package cn.haina.service.impl;


import cn.haina.dao.SortDao;
import cn.haina.entity.Sort;
import cn.haina.myconfig.MyKeyGenerator;
import cn.haina.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "sort_cache")
public class SortServiceImpl implements SortService {
    @Autowired
    SortDao sortDao;
    @Autowired
    MyKeyGenerator myKeyGenerator;

    @Override
    @Cacheable(keyGenerator = "myKeyGenerator")
    public List<Sort> getSortList(Integer parent_id) {
        return  sortDao.getSortList(parent_id);
    }

}
