package cn.haina.prodetails.service;

import cn.haina.dao.SpecificationoptionDao;
import cn.haina.entity.Specificationoption;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpecificationoptionServiceImpl implements SpecificationoptionService {
    @Resource
    private SpecificationoptionDao specificationoptionDao;
    @Override
    /**
     * 通过spuid查询规格组合规格所有信息
     */
    public List<Specificationoption> queryAllBySpuId(Long spuid) {
        return specificationoptionDao.queryAllBySpuId(spuid);
    }
}
