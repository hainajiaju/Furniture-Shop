package cn.haina;

import cn.haina.entity.User;
import cn.haina.utils.DetailsUtil;
import cn.haina.utils.MD5;
import cn.haina.utils.RedisUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisTest {
    @Resource
    private RedisUtil redisUtil;
    @Test
    public void set(){
        User user = new User();
        user.setId(1l);
        user.setName("张三");
        redisUtil.set("1", JSONObject.toJSONString(user));
        String aa = redisUtil.get("1");
//        System.out.println(aa);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            User user1 = objectMapper.readValue(aa, User.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDetails() throws IOException {
        String json = redisUtil.get("1");
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json, User.class);
        String key = "details:"+ MD5.getMd5(user.getId()+user.getName(),24);
        DetailsUtil detailsUtil = new DetailsUtil(2,1900,"精美卧室套餐","http://img.hnjj.csdn.cn/pic2.jpg");
        List<String> strings = redisUtil.setDetails(key, objectMapper.writeValueAsString(detailsUtil));
        for (String string : strings) {
            System.out.println(objectMapper.readValue(string, DetailsUtil.class));
        }
    }
}
