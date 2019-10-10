package cn.haina.prodetails.service;

import cn.haina.entity.User;

public interface UserService {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);
}
