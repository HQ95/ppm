package com.turing.ppm.service.impl;

import com.turing.ppm.entity.SysUsers;
import com.turing.ppm.entity.SysUsersExample;
import com.turing.ppm.mapper.SysUsersMapper;
import com.turing.ppm.service.SysUsersService;
import com.turing.ppm.until.SaltUntil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUsersServiceImpl implements SysUsersService {
    @Autowired
    private SysUsersMapper sysUsersMapper;

    @Override
    public int addUser(SysUsers users) {
        String salt = SaltUntil.getSalt(8);
        users.setStatus(salt);
        Md5Hash md5 = new Md5Hash(users.getPassword(), salt, 95);
        users.setPassword(md5.toHex());
        return sysUsersMapper.insertSelective(users);
    }

    @Override
    public SysUsers findByName(String name) {
        SysUsersExample example = new SysUsersExample();
        example.createCriteria().andLoginIdEqualTo(name);
        List<SysUsers> sysUsers = sysUsersMapper.selectByExample(example);
        return sysUsers.size() > 0 ? sysUsers.get(0) : null;
    }

    @Override
    public int updPass(String loginId, String password, String repass) {
        //密码输入正确就修改密码
        int num=0;
        Subject subject =SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(loginId,password);
        try {
            subject.login(token);
            if(subject.isAuthenticated()){
                //根据名字查询用户获取盐值
                SysUsers user = findByName(loginId);
                Md5Hash md5 = new Md5Hash(repass, user.getStatus(), 95);
                SysUsersExample example=new SysUsersExample();
                example.createCriteria().andLoginIdEqualTo(loginId);
                SysUsers users = new SysUsers();
                users.setPassword(md5.toHex());
                num=sysUsersMapper.updateByExampleSelective(users, example);
            }
        }catch (Exception e){
            num=-1;
        }
        return num;
    }
}
