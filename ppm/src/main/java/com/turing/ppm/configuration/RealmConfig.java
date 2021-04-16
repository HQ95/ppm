package com.turing.ppm.configuration;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.turing.ppm.realm.MyRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class RealmConfig {

    /**
     * 自定义realm
     * @return
     */
    @Bean
    public MyRealm realm(){
        MyRealm realm=new MyRealm();
        HashedCredentialsMatcher matcher=new HashedCredentialsMatcher("md5");
        matcher.setHashIterations(95);
        realm.setCredentialsMatcher(matcher);
        return realm;
    }

    /**
     * 安全管理器
     * @param realm
     * @return
     */
    @Bean
    public DefaultSecurityManager defaultSecurityManager(MyRealm realm){
        DefaultSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        return securityManager;
    }

    /**
     * 过滤器
     * @param defaultSecurityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultSecurityManager defaultSecurityManager){
        ShiroFilterFactoryBean filter=new ShiroFilterFactoryBean();
        filter.setSecurityManager(defaultSecurityManager);
        HashMap<String,String> map=new HashMap<>();
        //放行的资源anon
        map.put("/css/**", "anon");
        map.put("/fonts/**", "anon");
        map.put("/images/**", "anon");
        map.put("/js/**", "anon");
        map.put("/locale/**", "anon");
        map.put("/login", "anon");
        map.put("/register", "anon");
        map.put("/sysUsers/login", "anon");
        map.put("/sysUsers/userRegister", "anon");
        map.put("/sysUsers/name", "anon");
        //拦截的资源authc
        map.put("/**","authc");

        filter.setFilterChainDefinitionMap(map);
        filter.setLoginUrl("/login");
        return filter;
    }

    /**
     * 配置shiro方言(让thymeleaf认识shiro)
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect(){
        return  new ShiroDialect();
    }
}
