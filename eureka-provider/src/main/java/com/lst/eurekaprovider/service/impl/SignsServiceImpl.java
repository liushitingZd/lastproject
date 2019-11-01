package com.lst.eurekaprovider.service.impl;

import com.lst.eurekaprovider.mapper.SignsMapper;
import com.lst.eurekaprovider.model.Signs;
import com.lst.eurekaprovider.service.ISignsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignsServiceImpl implements ISignsService {

    @Autowired
    private SignsMapper signsMapper;

    @Override
    public int insert(Signs record) {
        return signsMapper.insert(record);
    }

    @Override
    public int insertSelective(Signs record) {
        return signsMapper.insertSelective(record);
    }

    @Override
    public List<Signs> listAlla() {
        return signsMapper.listAlla();
    }

    @Override
    public List<Signs> listAllb() {
        return signsMapper.listAllb();
    }

    @Override
    public List<Signs> listAll() {
        return signsMapper.listAll();
    }
}
