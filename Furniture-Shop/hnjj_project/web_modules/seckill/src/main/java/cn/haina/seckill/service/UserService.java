package cn.haina.seckill.service;

import cn.haina.dao.UserDao;
import cn.haina.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public User queryById(Integer id) {
        return userDao.queryById(id);
    }
}
