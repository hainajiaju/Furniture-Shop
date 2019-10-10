package cn.haina.prodetails.service;

import cn.haina.entity.Specificationoption;
import java.util.List;

public interface SpecificationoptionService {
    /**
     * 通过spuid查询规格组合规格所有信息
     *
     * @param spuid 主键
     * @return 实例对象
     */
    List<Specificationoption> queryAllBySpuId( Long spuid);
}
