package com.turing.ppm.realm;


import com.turing.ppm.entity.SysUsers;
import com.turing.ppm.service.SysUsersService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {
    @Autowired
    private SysUsersService sysUsersService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String name = (String) authenticationToken.getPrincipal();
        SysUsers user = sysUsersService.findByName(name);
        if(user!=null){
            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user.getLoginId(), user.getPassword(), ByteSource.Util.bytes(user.getStatus()),this.getName());
            return info;
        }
        return null;
    }
}
