package com.lst.eurekaprovider.service.impl;

import com.lst.eurekaprovider.mapper.GjzMapper;
import com.lst.eurekaprovider.model.Gjz;
import com.lst.eurekaprovider.service.IGjzService;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GjzServiceImpl implements IGjzService {

    @Autowired
    private GjzMapper gjzMapper;

    @Override
    public int add(Gjz gjz) {
        return gjzMapper.insert(gjz);
    }

    @Override
    public List<Gjz> listGjz(Gjz gjz, PageBean pageBean) {
        return gjzMapper.list(gjz);
    }

    @Override
    public Gjz load(Gjz gjz) {
        return gjzMapper.load(gjz.getJid());
    }

    @Override
    public int deleteGjz(Gjz gjz) {
        return gjzMapper.delete(gjz.getJid());
    }

    @Override
    public int updateGjz(Gjz gjz) {
        return gjzMapper.update(gjz);
    }
}
