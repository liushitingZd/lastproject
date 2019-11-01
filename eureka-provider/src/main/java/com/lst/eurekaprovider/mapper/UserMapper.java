package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}