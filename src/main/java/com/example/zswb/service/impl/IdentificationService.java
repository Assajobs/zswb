package com.example.zswb.service.impl;

import com.example.zswb.bean.Identification;
public interface IdentificationService{


    int deleteByPrimaryKey(Integer identityId);

    int insert(Identification record);

    int insertSelective(Identification record);

    Identification selectByPrimaryKey(Integer identityId);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);

}
