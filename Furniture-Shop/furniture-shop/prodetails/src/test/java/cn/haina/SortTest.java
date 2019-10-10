package cn.haina;

import cn.haina.entity.Sort;
import cn.haina.prodetails.service.SortService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SortTest {
    @Resource
    private SortService sortService;
    @Test
    public void queryNameById(){
        Sort sort = sortService.queryNameById(5l);
        System.out.println(sort.getId()+"/"+sort.getName()+"/"+sort.getParentName());
    }
}
