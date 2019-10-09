package cn.haina.prodetails.service;

import cn.haina.dao.AttributeDao;
import cn.haina.entity.Attribute;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Resource
    private AttributeDao attributeDao;
    @Override
    /**
     * 通过商品ID查询属性和属性下的选项数据以及每个选项对应图片
     */
    public List<Attribute> queryAllBySortId(Integer id) {
        return attributeDao.queryAllBySortId(id);
    }
}
