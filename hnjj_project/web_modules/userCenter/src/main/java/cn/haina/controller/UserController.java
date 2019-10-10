package cn.haina.controller;

import cn.haina.entity.Order;
import cn.haina.entity.User;
import cn.haina.serivce.OrderService;
import cn.haina.serivce.UserService;
import cn.haina.tools.EncryptPhone;
import cn.haina.tools.Result;
import cn.haina.tools.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;


    @GetMapping("/userCenter")
    public Result<User> userCenter(Integer id){
        System.out.println(id+"-=>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        List<User> users=userService.userCenter(id.longValue());
        System.out.println(id);
        System.out.println(users);
        return ResultUtil.success(users);
    }

    @PostMapping("/orders")
    public Result<Order> userOrders(Integer id){
        System.out.println(id+"-=>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        List<Order> orders=orderService.userOrders(id.longValue());
        System.out.println(id);
        System.out.println(orders);
        return ResultUtil.success(orders);
    }

    @PostMapping("/alipay")
    public String alipay(String orderNo){
        return orderNo;
    }

    @PostMapping("/personaldata")
    public Result<User> personaldata(Integer id){
        List<User> users=userService.userCenter(id.longValue());
        return ResultUtil.success(users);
    }

    @PostMapping("/personaldataUpdate")
    public Result<User> personaldataUpdate(String nicheng,Long id,String touxiang){
        User user=new User();
        user.setNicheng(nicheng);
        user.setId(id);
        user.setTouxiang(touxiang);
        int count=userService.personaldataUpdate(user);
        if(count>0){
            return ResultUtil.success("个人资料修改成功!");
        }else{
            return ResultUtil.error(-1,"个人资料修改失败!");
        }
    }

    @PostMapping("/accountSecurity")
    public Result<User> accountSecurity(Integer id){
        User user=new User();
        user=userService.accountSecurity(id.longValue());
        EncryptPhone encryptPhone=new EncryptPhone();
        user.setName(encryptPhone.getPhone1(user.getName()));
        System.out.println(encryptPhone.getPhone1(user.getName()));
        return ResultUtil.success(user);
    }

    @PostMapping("/updatePhone")
    public Result<User> updatePhone(Integer id,String name){
        User user=new User();
        user.setId(id.longValue());
        user.setName(name);
        Map<String,Object> map=new HashMap<String,Object>();
        int count=userService.updatePhone(user);
        if(count>0){
            return ResultUtil.success("修改手机号成功!");
        }else{
            return ResultUtil.error(-1,"修改手机号失败!");
        }
    }

    @PostMapping("/updatePassword")
    public Result<User> updatePassword(Integer id,String password){
        User user=new User();
        user.setId(id.longValue());
        user.setPassword(password);
        Map<String,Object> map=new HashMap<String,Object>();
        int count=userService.updatePassword(user);
        if(count>0){
            return ResultUtil.success("修改密码成功!");
        }else{
            return ResultUtil.error(-1,"修改密码失败!");
        }
    }

}

