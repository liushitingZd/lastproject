package com.lst.eurekaprovider.service;

import com.lst.eurekaprovider.model.GjzType;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IGjzTypeService {

    int add(GjzType gjzType);
    List<GjzType> listGjzType(GjzType gjzType, PageBean pageBean);
    GjzType load(GjzType gjzType);
    int deleteGjzType(GjzType gjzType);
    int updateGjzType(GjzType gjzType);

}
