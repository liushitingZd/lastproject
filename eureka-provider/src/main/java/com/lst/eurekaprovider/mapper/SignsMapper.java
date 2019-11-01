package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Signs;

import java.util.List;

public interface SignsMapper {
    int insert(Signs record);

    int insertSelective(Signs record);

    //关注
    List<Signs> listAlla();

    //取消关注
    List<Signs> listAllb();

    List<Signs> listAll();
}