package cn.haina.service;

import cn.haina.beans.Sorts;
import cn.haina.entity.Sort;

import java.util.List;

public interface SortService {
    public List<Sort> getSortList(Integer parentId);
}
