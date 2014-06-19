/*
Navicat MySQL Data Transfer
//============================
Source Server         : mysql
Source Server Version : 50150
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2014-06-06 14:24:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `memberId` int(11) NOT NULL AUTO_INCREMENT,
  `memberName` varchar(255) DEFAULT NULL,
  `memberPWD` varchar(255) DEFAULT NULL,
  `memberRealName` varchar(255) DEFAULT NULL,
  `memberIcon` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `homephone` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `postCode` varchar(255) DEFAULT NULL,
  `isAdmin` varchar(255) DEFAULT NULL,
  `isPower` varchar(255) DEFAULT NULL,
  `mark` varchar(255) DEFAULT NULL,
  `action` varchar(255) DEFAULT NULL,
  `topicCount` varchar(255) DEFAULT NULL,
  `replyCount` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `LastVist` datetime DEFAULT NULL,
  PRIMARY KEY (`memberId`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', 'zhp1111111111111111', '1231111111', '22222222222222', null, null, null, null, null, null, null, null, null, null, null, '100', null, '2014-06-06 14:16:35', null);
INSERT INTO `member` VALUES ('11', 'zhp', '123', '88', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `member` VALUES ('12', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('13', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('14', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('15', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('16', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('17', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('18', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
INSERT INTO `member` VALUES ('19', 'zhp', '123', 'sssssss', null, null, null, null, null, null, null, null, null, null, null, '0', '0', null, null);
