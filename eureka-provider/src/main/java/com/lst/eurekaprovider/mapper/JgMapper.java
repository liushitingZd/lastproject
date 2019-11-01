package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Jg;

public interface JgMapper {
    int insert(Jg record);

    int insertSelective(Jg record);
}