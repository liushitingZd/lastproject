package com.lst.eurekaprovider.service.impl;

import com.lst.eurekaprovider.mapper.GjzTypeMapper;
import com.lst.eurekaprovider.model.GjzType;
import com.lst.eurekaprovider.service.IGjzTypeService;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GjzTypeServiceImpl implements IGjzTypeService {

    @Autowired
    private GjzTypeMapper gjzTypeMapper;

    @Override
    public int add(GjzType gjzType) {
        return gjzTypeMapper.insert(gjzType);
    }

    @Override
    public List<GjzType> listGjzType(GjzType gjzType, PageBean pageBean) {
        return gjzTypeMapper.list(gjzType);
    }

    @Override
    public GjzType load(GjzType gjzType) {
        return gjzTypeMapper.load(gjzType.getGjid());
    }

    @Override
    public int deleteGjzType(GjzType gjzType) {
        return gjzTypeMapper.delete(gjzType.getGjid());
    }

    @Override
    public int updateGjzType(GjzType gjzType) {
        return gjzTypeMapper.update(gjzType);
    }
}
