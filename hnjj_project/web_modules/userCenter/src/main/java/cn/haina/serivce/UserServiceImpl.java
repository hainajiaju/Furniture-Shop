package cn.haina.serivce;

import cn.haina.dao.UserDao;
import cn.haina.entity.User;
import cn.haina.exception.UserLoginFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User login(String name, String password){
        User user=this.findByUsername(name);
        if(null!=user&&user.getPassword().equals(password))
        {
            if(user.getExtiis()!=1){
                try {
                    throw new UserLoginFailedException("用户未激活");
                } catch (UserLoginFailedException e) {
                    e.printStackTrace();
                }
            }
            return user;
        }
        else
            return null;
    }

    @Override
    public int saveUser(User user) {
        return 0;
    }

    @Override
    public int personaldataUpdate(User user) {
        return userDao.personaldataUpdate(user);
    }

    @Override
    public List<User> userCenter(Long id) {
        return userDao.userCenter(id);
    }

    @Override
    public User accountSecurity(Long id) {
        return userDao.accountSecurity(id);
    }


    @Override
    public int updatePhone(User user) {
        return userDao.updatePhone(user);
    }

    @Override
    public int updatePassword(User user) {
        return userDao.updatePassword(user);
    }

    public User findByUsername(String username){
        Map<String, Object> param=new HashMap();
        param.put("name", username);
        List<User> list= userDao.getUserListByMap(param);
        if(list.size()>0)
            return list.get(0);
        else
            return null;
    }



}
