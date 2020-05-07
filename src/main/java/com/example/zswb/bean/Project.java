package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    //项目编号 自增，主键
    private Integer project_id;
    //项目名称 非空
    private String project_name;
    //项目预算 非空
    private Double project_budget;
    //项目介绍 非空
    private String project_introduce;
    //项目文档 非空
    private String project_file;
    //项目发布者 非空
    private Integer project_publisher;


}
