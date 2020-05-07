-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS identification;
CREATE TABLE identification(
	identity_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '认证编号 自增、主键',
	identity_card VARCHAR (50) NOT NULL DEFAULT '' COMMENT '身份证号 非空',
	identity_image VARCHAR (50) NOT NULL DEFAULT '' COMMENT '身份证正面反 非空',
	identity_status INT (11) NOT NULL DEFAULT -1 COMMENT '认证状态 非空（0代表未认证，1代表认证通过）',
	identity_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (identity_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'identification';
