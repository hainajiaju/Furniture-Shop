package cn.haina.controller;


import cn.haina.beans.Sorts;
import cn.haina.beans.SpuVo;
import cn.haina.entity.Sort;
import cn.haina.mapper.SortMapper;
import cn.haina.mapper.SpuMapper;
import cn.haina.service.SortService;
import cn.haina.utils.ResultUtil;
import cn.haina.utils.SearchTest;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class SortController {
      @Autowired
      SortService sortService;
      @Autowired
      SortMapper sortMapper;
      @Autowired
      SpuMapper spuMapper;
    @RequestMapping(method = RequestMethod.GET,name = "getsort")
    public ResultUtil getSortList(Integer id){
        List<Sort> list = null;
        try {
            list  =sortService.getSortList(id);
        }catch (Exception e){
            e.printStackTrace();
            return  ResultUtil.error("出错啦！！！");
        }
        return  ResultUtil.error("true",list);
    }

    @GetMapping("search")
    public ResultUtil getSearch(){
//        List<SearchUtils> list = new ArrayList<>();
        List<SearchTest> searchTestList = new ArrayList<>();
        try{
            List<Sorts> level1 = sortMapper.findByParentId(0L);
            System.out.println(new Gson().toJson(level1));
            for (Sorts sorts1 : level1) {
                //保存一级分类
                SearchTest searchTest1 = new SearchTest();
                searchTest1.setSorts(sorts1);
                //查询二级分类
                List<Sorts> level2 =sortMapper.findByParentId(sorts1.getId());
                System.out.println(new Gson().toJson(level2));
                //创建工具类 list  -》 sorts List<SearchTest> List<SPU>
                List<SearchTest> searchTestList1 = new ArrayList<>();
                //循环二级分类
                for (Sorts sorts2 : level2) {
                    SearchTest searchTest2 = new SearchTest();
                    //保存相应二级分类
                    searchTest2.setSorts(sorts2);
                    searchTestList1.add(searchTest2);
                    List<SearchTest> searchTestList2 = new ArrayList<>();
                    //查询三级分类
                    List<Sorts> level3 =sortMapper.findByParentId(sorts2.getId());
                    System.out.println(new Gson().toJson(level3));
                    for (Sorts sorts3 : level3) {
                        SearchTest searchTest3 = new SearchTest();
                        searchTest3.setSorts(sorts3);
                        List<SpuVo> spulist=spuMapper.findBySortId(sorts3.getId());
                        System.out.println(new Gson().toJson(spulist));
                        searchTest3.setSpuList(spulist);
                        searchTestList2.add(searchTest3);

                    }
                    searchTest2.setList(searchTestList2);

                }
                searchTest1.setList(searchTestList1);
                searchTestList.add(searchTest1);
            }

        }catch (Exception e){
            e.printStackTrace();
            return  ResultUtil.error("出错啦！！！");
        }
        return  ResultUtil.ok("true",searchTestList);
    //找出一级分类


//        for (Sorts sort:level1) {
//            SearchUtils searchUtils = new SearchUtils();
//            searchUtils.setId(sort.getId());
//            searchUtils.setName(sort.getName());
//            List<Sorts> level2 =sortMapper.queryAllByParent_id(sort.getId());
//            searchUtils.setLevel2(level2);
//
//            List<Search> SearchList =new ArrayList<>();
//            for(Sorts sort2 : level2){
//                List<Sorts> level3= sortMapper.queryAllByParent_id(sort2.getId());
//
//                Search search = new Search();
//                search.setId(sort2.getId());
//                search.setName(sort2.getName());
//                search.setLevel3(level3);
//                SearchList.add(search);
//            }
//            searchUtils.setSearchList(SearchList);
//        }

    }
}
