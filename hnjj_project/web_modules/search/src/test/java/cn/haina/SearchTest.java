package cn.haina;


import cn.haina.beans.Sorts;
import cn.haina.mapper.SortMapper;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchTest {
    @Autowired
    SortMapper sortMapper;
    @Test
    public void context(){
        Sorts sorts = sortMapper.querySortsById(1L);
        System.err.println(new Gson().toJson(sorts));
    }
}
