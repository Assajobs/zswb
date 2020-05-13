package com.example.zswb.dao;

import com.example.zswb.bean.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    //根据id查询
    Users selectByPrimaryKey(Integer userId);
    //根据邮箱查询
    String selectByEmail(String email);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}