package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Gjz;

import java.util.List;

public interface GjzMapper {
    int insert(Gjz record);

    int insertSelective(Gjz record);

    List<Gjz> list(Gjz record);

    Gjz load(int gid);

    int delete(int gid);

    int update(Gjz record);
}