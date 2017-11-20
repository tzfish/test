/*
Navicat MySQL Data Transfer

Source Server         : localhost-tan
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : train

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-17 23:36:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_class_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_class_info`;
CREATE TABLE `t_class_info` (
`classno`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '班级号' ,
`classna`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级名称' ,
`creatti`  datetime NOT NULL COMMENT '创建时间' ,
`level`  char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年级' ,
`schlid`  int(11) UNSIGNED NULL DEFAULT NULL COMMENT '机构id' ,
`userid`  int(11) UNSIGNED NULL DEFAULT NULL COMMENT '创建者id' ,
`tag`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签' ,
`detail`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公告' ,
PRIMARY KEY (`classno`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `t_faimly_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_faimly_info`;
CREATE TABLE `t_faimly_info` (
`faimid`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '家庭id' ,
`faimna`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称' ,
`detail`  varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注' ,
`creati`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
PRIMARY KEY (`faimid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `t_schedule_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_schedule_info`;
CREATE TABLE `t_schedule_info` (
`schdid`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '工作日程id' ,
`userid`  int(11) UNSIGNED NOT NULL COMMENT '日程所属用户id' ,
`title`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题' ,
`content`  varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容' ,
`schdti`  datetime NOT NULL COMMENT '创建时间' ,
`schdtp`  varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日程类型' ,
`alerttp`  varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '00' COMMENT '提醒类型，00-不提醒，01-正点提醒，02-提前5分钟，03-提前15分钟,04-提前30分钟，05-提前一小时，06-提前一天,07-提前2天，08-提前3天' ,
`alerti`  datetime NULL DEFAULT NULL COMMENT '提醒类型' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态(0-未开始，1-进行中。2-已完成，3-作废，删除)' ,
`creati`  date NOT NULL COMMENT '创建时间' ,
`linkid`  int(11) UNSIGNED NULL DEFAULT NULL COMMENT '关联id,' ,
PRIMARY KEY (`schdid`),
INDEX `userid` (`userid`) USING BTREE ,
INDEX `schdti` (`schdti`) USING BTREE ,
INDEX `userid_schdtp` (`userid`, `schdtp`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `t_task_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_task_info`;
CREATE TABLE `t_task_info` (
`taskid`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '作业id' ,
`title`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题' ,
`content`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容' ,
`image`  varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`beginti`  datetime NULL DEFAULT NULL COMMENT '开始时间' ,
`endti`  datetime NULL DEFAULT NULL ,
`taskti`  datetime NULL DEFAULT NULL COMMENT '任务发布时间' ,
`level`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '任务级别' ,
`tasktp`  char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务类型，保留' ,
PRIMARY KEY (`taskid`),
UNIQUE INDEX `taskid` (`taskid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `t_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
`userid`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户id' ,
`userna`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名' ,
`jointi`  datetime NULL DEFAULT NULL COMMENT '加入时间' ,
`mobile`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码' ,
`e_mail`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱' ,
`classid`  int(11) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '班级id' ,
`faimid`  int(11) UNSIGNED NULL DEFAULT NULL COMMENT '家庭id' ,
`cityno`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市' ,
`pingyna`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名首字母' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态，0-正常，1-冻结' ,
`borndt`  date NULL DEFAULT NULL COMMENT '出生年月' ,
`imgpath`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像地址' ,
`gender`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别，0-女生，1-男生' ,
`role`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '角色,1-学生，2-老师，3家长' ,
PRIMARY KEY (`userid`),
UNIQUE INDEX `mobile` (`mobile`) USING BTREE ,
UNIQUE INDEX `e_mail` (`e_mail`) USING BTREE ,
INDEX `letter` (`pingyna`) USING BTREE ,
INDEX `classno` (`classid`) USING BTREE ,
INDEX `projno` (`faimid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Table structure for `t_user_login`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_login`;
CREATE TABLE `t_user_login` (
`userid`  int(11) UNSIGNED NOT NULL COMMENT '用户id' ,
`passwd`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '123456' COMMENT '密码' ,
`sessid`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会话id' ,
`token`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录tokend' ,
`devitp`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备类型 1-android,2-ios' ,
`longti`  datetime NULL DEFAULT NULL COMMENT '登录时间' ,
PRIMARY KEY (`userid`),
UNIQUE INDEX `sessid` (`sessid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci

;

-- ----------------------------
-- Table structure for `t_user_task`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_task`;
CREATE TABLE `t_user_task` (
`id`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id' ,
`userid`  int(11) UNSIGNED NOT NULL COMMENT '用户id' ,
`taskid`  int(11) UNSIGNED NOT NULL COMMENT '任务id' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT '状态0-未完成，1-进行中，2-完成' ,
`finishti`  datetime NULL DEFAULT NULL ,
`iamge`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片' ,
`score`  float NULL DEFAULT NULL COMMENT '分数' ,
`comment`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言' ,
PRIMARY KEY (`id`),
FOREIGN KEY (`taskid`) REFERENCES `t_task_info` (`taskid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
FOREIGN KEY (`userid`) REFERENCES `t_user_info` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
INDEX `userid` (`userid`) USING BTREE ,
INDEX `taskid` (`taskid`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Auto increment value for `t_class_info`
-- ----------------------------
ALTER TABLE `t_class_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `t_faimly_info`
-- ----------------------------
ALTER TABLE `t_faimly_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `t_schedule_info`
-- ----------------------------
ALTER TABLE `t_schedule_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `t_task_info`
-- ----------------------------
ALTER TABLE `t_task_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `t_user_info`
-- ----------------------------
ALTER TABLE `t_user_info` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `t_user_task`
-- ----------------------------
ALTER TABLE `t_user_task` AUTO_INCREMENT=1;
