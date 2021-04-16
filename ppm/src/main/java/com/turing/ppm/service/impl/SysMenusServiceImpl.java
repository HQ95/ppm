package com.turing.ppm.service.impl;

import com.turing.ppm.entity.SysMenus;
import com.turing.ppm.entity.SysMenusExample;
import com.turing.ppm.mapper.SysMenusMapper;
import com.turing.ppm.service.SysMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenusServiceImpl implements SysMenusService {
    @Autowired
    private SysMenusMapper sysMenusMapper;

    @Override
    public List<SysMenus> findTree() {
        SysMenusExample example=new SysMenusExample();
        example.createCriteria().andParentIdEqualTo(0);
        //获取所有的父节点
        List<SysMenus> sysMenus = sysMenusMapper.selectByExample(example);
        return findChildren(sysMenus);
    }

    /**
     * 递归
     * @param sysMenus
     * @return
     */
    public  List<SysMenus> findChildren(List<SysMenus> sysMenus){
        //循环所有父节点，根据id查询子节点
        for (SysMenus mens : sysMenus) {
            SysMenusExample example=new SysMenusExample();
            example.createCriteria().andParentIdEqualTo(mens.getId());
            List<SysMenus> sm = sysMenusMapper.selectByExample(example);
            if(sm.size()>0){
                //设置子节点
                mens.setChildren(sm);
                findChildren(sm);
            }
        }
        return sysMenus;
    }

}
