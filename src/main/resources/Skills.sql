-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS skills;
CREATE TABLE skills(
	skill_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '技能编号 自增、主键',
	skill_evaluate VARCHAR (50) NOT NULL DEFAULT '' COMMENT '经验自评 非空',
	skill_person INT (11) NOT NULL DEFAULT -1 COMMENT '所属人 非空',
	PRIMARY KEY (skill_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'skills';
