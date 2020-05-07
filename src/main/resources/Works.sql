-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS works;
CREATE TABLE works(
	works_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '作品编号 自增、主键',
	works_name VARCHAR (50) UNIQUE NOT NULL DEFAULT '' COMMENT '作品名称 非空、唯一',
	works_trade VARCHAR (50) NOT NULL DEFAULT '' COMMENT '所属行业 非空',
	works_keyword VARCHAR (50) NOT NULL DEFAULT '' COMMENT '关键词 非空',
	works_href INT (11) NOT NULL DEFAULT -1 COMMENT '作品链接 非空',
	works_duty VARCHAR (50) NOT NULL DEFAULT '' COMMENT '作品职责 非空',
	works_image VARCHAR (50) NOT NULL DEFAULT '' COMMENT '作品截图 非空',
	works_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (works_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'works';
