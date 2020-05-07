package com.example.zswb.service.impl;

import com.example.zswb.bean.Works;
public interface WorksService{


    int deleteByPrimaryKey(Integer worksId);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Integer worksId);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

}
