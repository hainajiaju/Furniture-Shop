package cn.haina.utils;

import cn.haina.beans.Sorts;
import cn.haina.beans.SpuVo;
import cn.haina.entity.Spu;

import java.util.List;

public class SearchTest {
    private Sorts sorts;
    private List<SearchTest> list;
    private List<SpuVo> spuList;

    public Sorts getSorts() {
        return sorts;
    }

    public void setSorts(Sorts sorts) {
        this.sorts = sorts;
    }

    public List<SearchTest> getList() {
        return list;
    }

    public void setList(List<SearchTest> list) {
        this.list = list;
    }

    public List<SpuVo> getSpuList() {
        return spuList;
    }

    public void setSpuList(List<SpuVo> spuList) {
        this.spuList = spuList;
    }
}
