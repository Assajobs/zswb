-- auto Generated on 2020-05-07
-- DROP TABLE IF EXISTS users;
CREATE TABLE users(
	user_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '用户编号 自增，主键',
	user_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '用户昵称 非空',
	user_email VARCHAR (50) UNIQUE NOT NULL DEFAULT '' COMMENT '用户邮箱 非空，唯一',
	user_password VARCHAR (50) NOT NULL DEFAULT '' COMMENT '用户密码 非空',
	user_role INT (11) NOT NULL DEFAULT -1 COMMENT '用户角色 非空（0代表项目发布者，1代表项目接单者）',
	PRIMARY KEY (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'users';
