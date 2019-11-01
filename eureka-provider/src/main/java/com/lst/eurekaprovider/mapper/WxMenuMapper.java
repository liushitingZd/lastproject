package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.WxMenu;

public interface WxMenuMapper {
    int insert(WxMenu record);

    int insertSelective(WxMenu record);
}