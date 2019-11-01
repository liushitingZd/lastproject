package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Dict;

public interface DictMapper {
    int insert(Dict record);

    int insertSelective(Dict record);
}