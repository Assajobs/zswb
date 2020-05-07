package com.example.zswb.service.impl;

import com.example.zswb.bean.Project;
public interface ProjectService{


    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

}
