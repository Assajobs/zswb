-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS project;
CREATE TABLE project(
	project_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '项目编号 自增，主键',
	project_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '项目名称 非空',
	project_budget DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT '项目预算 非空',
	project_introduce VARCHAR (50) NOT NULL DEFAULT '' COMMENT '项目介绍 非空',
	project_file VARCHAR (50) NOT NULL DEFAULT '' COMMENT '项目文档 非空',
	project_publisher INT (11) NOT NULL DEFAULT -1 COMMENT '项目发布者 非空',
	PRIMARY KEY (project_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'project';
