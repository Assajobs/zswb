-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS education;
CREATE TABLE education(
	education_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '编号 自增、主键',
	education_start DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '开始时间 非空',
	education_end DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '结束时间 非空',
	school_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '学校名称 非空',
	profession VARCHAR (50) NOT NULL DEFAULT '' COMMENT '专业 非空',
	education_level VARCHAR (50) NOT NULL DEFAULT '' COMMENT '学历层次 非空',
	education_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (education_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'education';
