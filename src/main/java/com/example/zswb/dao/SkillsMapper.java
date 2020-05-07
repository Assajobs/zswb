package com.example.zswb.dao;

import com.example.zswb.bean.Skills;

public interface SkillsMapper {
    int deleteByPrimaryKey(Integer skillId);

    int insert(Skills record);

    int insertSelective(Skills record);

    Skills selectByPrimaryKey(Integer skillId);

    int updateByPrimaryKeySelective(Skills record);

    int updateByPrimaryKey(Skills record);
}