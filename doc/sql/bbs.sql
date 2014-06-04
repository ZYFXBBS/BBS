/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50150
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2014-06-04 12:01:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `memberId` int(11) NOT NULL,
  `memberName` varchar(255) DEFAULT NULL,
  `memberPWD` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', 'shenhua', 'shenhua');
