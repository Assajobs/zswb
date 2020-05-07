package com.example.zswb.service.impl;

import com.example.zswb.bean.Skills;
public interface SkillsService{


    int deleteByPrimaryKey(Integer skillId);

    int insert(Skills record);

    int insertSelective(Skills record);

    Skills selectByPrimaryKey(Integer skillId);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);

}
