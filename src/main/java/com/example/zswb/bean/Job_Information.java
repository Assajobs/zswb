package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job_Information {
    //工作信息编号 自增、非空
    private Integer job_id;
    //工作日时间 非空
    private Date job_time;
    //非工作日时间 非空
    private Date job_untime;
    //可工作地址 非空
    private String job_address;
    //周工作时长 非空
    private Integer job_hours;
    //日薪 非空
    private Double job_daysal;
    //工作形式 非空
    private String job_pattern;
    //所属人 非空
    private Integer job_person;



}
