package cn.haina.controller;

import cn.haina.entity.User;
import cn.haina.serivce.UserService;
import cn.haina.utils.MD5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {
    @Resource
    UserService userService;

    User user;

    @GetMapping("/login")
    public String login(String name,String password) {
        user = userService.login(name.trim(), MD5.getMd5(password.trim(), 32));
        if(user!=null){
            userService.saveUser(user);
        }
        return "login";
    }

    @GetMapping("/register")
    public String hello() {
        return "hello";
    }
}
