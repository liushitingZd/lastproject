package com.lst.eurekaprovider.service;

import com.lst.eurekaprovider.model.Gjz;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IGjzService {

    int add(Gjz gjz);
    List<Gjz> listGjz(Gjz gjz,PageBean pageBean);
    Gjz load(Gjz gjz);
    int deleteGjz(Gjz gjz);
    int updateGjz(Gjz gjz);

}
