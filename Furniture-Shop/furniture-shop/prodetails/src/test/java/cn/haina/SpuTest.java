package cn.haina;

import cn.haina.entity.Spu;
import cn.haina.prodetails.service.SpuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpuTest {
    @Resource
    private SpuService spuService;
    @Test
    public void querySpuById(){
        Spu spu = spuService.queryImageById(1);
        System.out.println(spu+"/"+spu.getDefaultImg());
    }
}
