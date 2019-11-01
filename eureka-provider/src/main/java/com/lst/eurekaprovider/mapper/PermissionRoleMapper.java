package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.PermissionRole;

public interface PermissionRoleMapper {
    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);
}