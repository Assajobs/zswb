package com.example.zswb.controller;

import com.example.zswb.bean.Users;
import com.example.zswb.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    UsersMapper usersMapper;

    @GetMapping("/addUser")
    @ResponseBody
    void add(){
    usersMapper.insert(new Users("a","b333","c",0));
    }

}
