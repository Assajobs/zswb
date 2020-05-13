package com.example.zswb.dao;

import com.example.zswb.bean.UserVo;
import com.example.zswb.bean.Users;

public interface UserVoMapper {

    UserVo selectUser(UserVo userVo);

    int updatePassword(String email,String password);

}
