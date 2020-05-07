package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    //简历编号 自增、主键
    private Integer rusume_id;
    //工作状态 非空
    private String resume_workstatus;
    //职业方向 非空
    private String resume_workdirection;
    //具体工作 非空
    private String resume_specificwork;
    //技能 非空
    private Integer resume_skill;
    //个人作品 非空
    private Integer resume_wroks;
    //个人介绍 非空
    private String resume_introduce;
    //所属人 非空
    private Integer resume_person;



}
