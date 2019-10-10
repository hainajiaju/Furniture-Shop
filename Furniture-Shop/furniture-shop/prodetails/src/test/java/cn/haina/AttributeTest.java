package cn.haina;

import cn.haina.entity.Attribute;
import cn.haina.entity.Images;
import cn.haina.entity.Option;
import cn.haina.prodetails.service.AttributeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttributeTest {
    @Resource
    private AttributeService attributeService;
    @Test
    //通过商品ID查询属性和属性下的选项数据以及每个选项对应图片
    public void AttributeAll(){
        List<Attribute> attributes = attributeService.queryAllBySortId(1);
        for (Attribute attribute : attributes) {
            System.out.println(attribute);
        }

    }
}
