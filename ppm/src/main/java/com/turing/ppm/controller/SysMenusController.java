package com.turing.ppm.controller;

import com.turing.ppm.entity.SysMenus;
import com.turing.ppm.service.SysMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sysMenus")
public class SysMenusController {

    @Autowired
    private SysMenusService sysMenusService;
    /**
     * 获取所有的菜单信息
     * @return
     */
    @GetMapping("/tree")
    @ResponseBody
    public List<SysMenus> getList(){
        return  sysMenusService.findTree();

    }
}
