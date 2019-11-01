package com.lst.eurekaprovider.service;

import com.lst.eurekaprovider.model.TreeNode;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ItreeNodeService {

    @Transactional(readOnly = true)
    public List<TreeNode> listAll();

    @Transactional(readOnly = true)
    public List<TreeNode> listChirld(TreeNode treeNode);

}
