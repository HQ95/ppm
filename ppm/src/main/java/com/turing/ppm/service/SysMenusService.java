package com.turing.ppm.service;

import com.turing.ppm.entity.SysMenus;

import java.util.List;

/**
 * 菜单信息
 */
public interface SysMenusService {

    /**
     * 获取菜单信息的所有节点
     * @return
     */
    public List<SysMenus> findTree();
}
