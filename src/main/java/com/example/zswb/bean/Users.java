package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    //用户编号 自增，主键
    private Integer user_id;
    //用户昵称 非空
    private String user_name;
    //用户邮箱 非空，唯一
    private String user_email;
    //用户密码 非空
    private String user_password;
    //用户角色 非空（0代表项目发布者，1代表项目接单者）
    private Integer user_role;


}
