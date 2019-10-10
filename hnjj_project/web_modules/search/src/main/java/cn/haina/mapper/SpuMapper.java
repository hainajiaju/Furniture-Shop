package cn.haina.mapper;

import cn.haina.beans.Sorts;
import cn.haina.beans.SpuVo;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SpuMapper  extends ElasticsearchRepository<SpuVo,Long> {
    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"sort_id\" : \"?0\"}}}}")
    public List<SpuVo> findBySortId(Long sort_id);
}
