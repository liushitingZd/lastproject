package com.lst.eurekaprovider.service;

import com.lst.eurekaprovider.model.Signs;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISignsService {

    int insert(Signs record);

    int insertSelective(Signs record);

    //关注
    List<Signs> listAlla();

    //取消关注
    List<Signs> listAllb();

    List<Signs> listAll();

}
