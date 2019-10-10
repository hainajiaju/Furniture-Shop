package cn.haina;

import cn.haina.entity.User;
import cn.haina.prodetails.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    private UserService userService;
    @Test
    /**
     * 根据id查询用户
     */
    public void queryUserById(){
        User user = userService.queryById(1l);
        System.out.println(user);
    }
}
