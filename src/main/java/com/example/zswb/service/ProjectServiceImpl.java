package com.example.zswb.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb.bean.Project;
import com.example.zswb.dao.ProjectMapper;
import com.example.zswb.service.impl.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public int deleteByPrimaryKey(Integer projectId) {
        return projectMapper.deleteByPrimaryKey(projectId);
    }

    @Override
    public int insert(Project record) {
        return projectMapper.insert(record);
    }

    @Override
    public int insertSelective(Project record) {
        return projectMapper.insertSelective(record);
    }

    @Override
    public Project selectByPrimaryKey(Integer projectId) {
        return projectMapper.selectByPrimaryKey(projectId);
    }

    @Override
    public int updateByPrimaryKeySelective(Project record) {
        return projectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Project record) {
        return projectMapper.updateByPrimaryKey(record);
    }

}
