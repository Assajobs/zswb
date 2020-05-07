package com.example.zswb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Identification {
    //认证编号 自增、主键
    private Integer identity_id;
    //身份证号 非空
    private String identity_card;
    //身份证正面反 非空
    private String identity_image;
    //认证状态 非空（0代表未认证，1代表认证通过）
    private Integer identity_status;
    //所属人 非空
    private Integer identity_person;


}
