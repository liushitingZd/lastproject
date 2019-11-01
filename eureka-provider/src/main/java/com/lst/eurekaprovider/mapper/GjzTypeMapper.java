package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.Gjz;
import com.lst.eurekaprovider.model.GjzType;

import java.util.List;

public interface GjzTypeMapper {
    int insert(GjzType record);
    int insertSelective(GjzType record);

    int update(GjzType gjzType);
    int delete(int gjzType);
    GjzType load(int gjzType);
    List<GjzType> list(GjzType gjzType);

}