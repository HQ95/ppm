package com.turing.ppm.controller;

import com.turing.ppm.entity.Supplier;
import com.turing.ppm.entity.SysUsers;
import com.turing.ppm.service.SysUsersService;
import org.apache.catalina.Session;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/sysUsers")
public class SysUsersController {
    @Autowired
    private SysUsersService sysUsersService;
    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public int login(SysUsers user, HttpSession session){
        int num=0;
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(user.getLoginId(), user.getPassword());
        try {
            subject.login(token);
            //获取登录的用户储存到session中
            String name= (String) SecurityUtils.getSubject().getPrincipal();
            SysUsers byName =sysUsersService.findByName(name);
            session.setAttribute("user", byName);
            num=1;
        }catch (UnknownAccountException e){
            //用户名错误
            num=2;
        }catch (IncorrectCredentialsException e){
            //密码错误
            num=3;
        }
        return num;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/userRegister")
    @ResponseBody
    public int register(SysUsers user){
        int num= sysUsersService.addUser(user);
        return num;
    }

    /**
     * 查询用户名是否已存在
     * @param loginId
     * @return
     */
    @PostMapping("/name")
    @ResponseBody
    public String byName(String loginId){
        SysUsers user = sysUsersService.findByName(loginId);
        return user!=null?"{\"valid\":false}":"{\"valid\":true}";
    }
    /**
     * 退出登录
     * @return
     */
    @GetMapping("/loginOut")
    public String loginOut(){
        SecurityUtils.getSubject().logout();
        return "redirect:/login";
    }

    /**
     * 跳转主页的控制器
     * @return
     */
    @GetMapping("/index")
    public String goMain(){
        return "redirect:/index";
    }



}
