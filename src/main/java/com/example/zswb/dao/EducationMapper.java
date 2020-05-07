package com.example.zswb.dao;

import com.example.zswb.bean.Education;

public interface EducationMapper {
    int deleteByPrimaryKey(Integer educationId);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer educationId);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}