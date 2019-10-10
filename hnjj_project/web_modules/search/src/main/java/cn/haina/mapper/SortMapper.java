package cn.haina.mapper;

import cn.haina.beans.Sorts;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface SortMapper extends ElasticsearchRepository<Sorts,Long> {
    Sorts querySortsById(Long id);
    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"parent_id\" : \"?0\"}}}}")
    List<Sorts> findByParentId(Long parentId);


}
