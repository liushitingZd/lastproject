package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}