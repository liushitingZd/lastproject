package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Permission;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);
}