package com.example.zswb.dao;

import com.example.zswb.bean.Resume;

public interface ResumeMapper {
    int deleteByPrimaryKey(Integer rusumeId);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer rusumeId);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}