package cn.haina;

import cn.haina.entity.Specificationoption;
import cn.haina.prodetails.service.SpecificationoptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpecificationoptionTest {
    @Resource
    private SpecificationoptionService specificationoptionService;
    @Test
    public void SpecificationoptionAll(){
        List<Specificationoption> specificationoptions = specificationoptionService.queryAllBySpuId(1l);
        for (Specificationoption specificationoption : specificationoptions) {
            System.out.println(specificationoption);
        }

    }
}
