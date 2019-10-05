package cn.haina.prodetails.service;

import cn.haina.dao.UserDao;
import cn.haina.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 根据用户id查询用户
     * @param id 主键
     * @return
     */
    @Override
    public User queryById(Long id) {
        return userDao.queryById(id);
    }
}
