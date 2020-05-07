-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS resume;
CREATE TABLE resume(
	rusume_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '简历编号 自增、主键',
	resume_workstatus VARCHAR (50) NOT NULL DEFAULT '' COMMENT '工作状态 非空',
	resume_workdirection VARCHAR (50) NOT NULL DEFAULT '' COMMENT '职业方向 非空',
	resume_specificwork VARCHAR (50) NOT NULL DEFAULT '' COMMENT '具体工作 非空',
	resume_skill INT (11) NOT NULL DEFAULT -1 COMMENT '技能 非空',
	resume_wroks INT (11) NOT NULL DEFAULT -1 COMMENT '个人作品 非空',
	resume_introduce VARCHAR (50) NOT NULL DEFAULT '' COMMENT '个人介绍 非空',
	resume_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (rusume_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'resume';
