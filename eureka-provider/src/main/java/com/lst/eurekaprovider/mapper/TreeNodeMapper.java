package com.lst.eurekaprovider.mapper;

import com.lst.eurekaprovider.model.TreeNode;

import java.util.List;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> listAll();

    List<TreeNode> listChirld(TreeNode treeNode);
}