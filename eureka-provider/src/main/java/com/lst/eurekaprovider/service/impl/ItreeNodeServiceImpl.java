package com.lst.eurekaprovider.service.impl;

import com.lst.eurekaprovider.mapper.TreeNodeMapper;
import com.lst.eurekaprovider.model.TreeNode;
import com.lst.eurekaprovider.service.ItreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItreeNodeServiceImpl implements ItreeNodeService {

    @Autowired
    private TreeNodeMapper treeNodeMapper;
    private TreeNode treeNode;


    @Override
    public List<TreeNode> listAll() {
        List<TreeNode> list = treeNodeMapper.listAll();
        List<TreeNode> listAll = new ArrayList<TreeNode>();
        for (TreeNode tree : list){
            List<TreeNode> listChirld = treeNodeMapper.listChirld(tree);
            tree.setChirld(listChirld);
            listAll.add(tree);
        }
        return listAll;
    }

    @Override
    public List<TreeNode> listChirld(TreeNode treeNode) {
        return treeNodeMapper.listChirld(treeNode);
    }
}
