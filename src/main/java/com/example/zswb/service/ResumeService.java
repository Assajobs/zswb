package com.example.zswb.service;

import com.example.zswb.bean.Resume;
public interface ResumeService{


    int deleteByPrimaryKey(Integer rusumeId);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(Integer rusumeId);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);

}
