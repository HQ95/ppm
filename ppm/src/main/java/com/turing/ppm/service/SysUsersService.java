package com.turing.ppm.service;
import com.turing.ppm.entity.SysUsers;

public interface SysUsersService {
    /**
     * 添加用户
     * @param users
     * @return
     */
    int addUser(SysUsers users);

    /**
     * 根据用户名查询用户
     * @param name 用户名
     * @return
     */
    SysUsers findByName(String name);

    /**
     * 修改用户密码
     * @param loginId 用户名
     * @param password 旧密码
     * @param repass 新密码
     * @return
     */
    int updPass(String loginId,String password,String repass);


}
