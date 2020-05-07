package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skills {
    //技能编号 自增、主键
    private Integer skill_id;
    //经验自评 非空
    private String skill_evaluate;
    //所属人 非空
    private Integer skill_person;



}
