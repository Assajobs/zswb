package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    //编号 自增、主键
    private Integer education_id;
    //开始时间 非空
    private Date education_start;
    //结束时间 非空
    private Date education_end;
    //学校名称 非空
    private String school_name;
    //专业 非空
    private String profession;
    //学历层次 非空
    private String education_level;
    //所属人 非空
    private Integer education_person;



}
