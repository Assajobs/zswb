package com.example.zswb.service.impl;

import com.example.zswb.service.SkillsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.zswb.dao.SkillsMapper;
import com.example.zswb.bean.Skills;

@Service
public class SkillsServiceImpl implements SkillsService {

    @Resource
    private SkillsMapper skillsMapper;

    @Override
    public int deleteByPrimaryKey(Integer skillId) {
        return skillsMapper.deleteByPrimaryKey(skillId);
    }

    @Override
    public int insert(Skills record) {
        return skillsMapper.insert(record);
    }

    @Override
    public int insertSelective(Skills record) {
        return skillsMapper.insertSelective(record);
    }

    @Override
    public Skills selectByPrimaryKey(Integer skillId) {
        return skillsMapper.selectByPrimaryKey(skillId);
    }

    @Override
    public int updateByPrimaryKeySelective(Skills record) {
        return skillsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Skills record) {
        return skillsMapper.updateByPrimaryKey(record);
    }

}
