package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.WxAccinfo;

public interface WxAccinfoMapper {
    int insert(WxAccinfo record);

    int insertSelective(WxAccinfo record);
}