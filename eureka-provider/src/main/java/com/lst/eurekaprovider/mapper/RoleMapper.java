package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}