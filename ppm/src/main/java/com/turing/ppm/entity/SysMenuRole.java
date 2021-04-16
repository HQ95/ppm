package com.turing.ppm.entity;

import java.io.Serializable;

public class SysMenuRole implements Serializable {
    private Integer menuId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}