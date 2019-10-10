package cn.haina.serivce;

import cn.haina.entity.User;

import java.util.List;

public interface UserService {
    public User login(String name, String password);
    public int saveUser(User user);
    public int personaldataUpdate(User user);
    public List<User> userCenter(Long id);
    public User accountSecurity(Long id);
    public int updatePhone(User user);
    public int updatePassword(User user);
}
