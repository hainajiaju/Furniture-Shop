package cn.haina;

import cn.haina.entity.User;
import cn.haina.utils.RedisUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;

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
}
