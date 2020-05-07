-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS job__information;
CREATE TABLE job__information(
	job_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '工作信息编号 自增、非空',
	job_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '工作日时间 非空',
	job_untime DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '非工作日时间 非空',
	job_address VARCHAR (50) NOT NULL DEFAULT '' COMMENT '可工作地址 非空',
	job_hours INT (11) NOT NULL DEFAULT -1 COMMENT '周工作时长 非空',
	job_daysal DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT '日薪 非空',
	job_pattern VARCHAR (50) NOT NULL DEFAULT '' COMMENT '工作形式 非空',
	job_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (job_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'job__information';
