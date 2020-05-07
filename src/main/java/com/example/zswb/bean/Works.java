package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Works {
    //作品编号 自增、主键
    private Integer works_id;
    //作品名称 非空、唯一
    private String works_name;
    //所属行业 非空
    private String works_trade;
    //关键词 非空
    private String works_keyword;
    //作品链接 非空
    private Integer works_href;
    //作品职责 非空
    private String works_duty;
    //作品截图 非空
    private String works_image;
    //所属人 非空
    private Integer works_person;


}
