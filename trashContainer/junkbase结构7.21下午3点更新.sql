/*
Navicat MySQL Data Transfer

Source Server         : mysql-connection
Source Server Version : 50150
Source Host           : 127.0.0.1:3306
Source Database       : trashbase

Target Server Type    : MYSQL
Target Server Version : 50150
File Encoding         : 65001

Date: 2019-07-21 14:24:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `userid` int(11) NOT NULL,
  `ansname` varchar(255) DEFAULT NULL,
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`number`),
  KEY `city_refe` (`city`),
  KEY `userid_refe` (`userid`),
  CONSTRAINT `city_refe` FOREIGN KEY (`city`) REFERENCES `trycity` (`cityname`),
  CONSTRAINT `userid_refe` FOREIGN KEY (`userid`) REFERENCES `userinfo` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for citytrashclass
-- ----------------------------
DROP TABLE IF EXISTS `citytrashclass`;
CREATE TABLE `citytrashclass` (
  `classid` int(11) NOT NULL AUTO_INCREMENT,
  `cityname` varchar(255) DEFAULT NULL,
  `classname` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classid`),
  KEY `class` (`cityname`),
  KEY `classname` (`classname`),
  CONSTRAINT `class` FOREIGN KEY (`cityname`) REFERENCES `trycity` (`cityname`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for classfornews
-- ----------------------------
DROP TABLE IF EXISTS `classfornews`;
CREATE TABLE `classfornews` (
  `className` varchar(255) NOT NULL,
  PRIMARY KEY (`className`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for gametest
-- ----------------------------
DROP TABLE IF EXISTS `gametest`;
CREATE TABLE `gametest` (
  `quesid` int(11) NOT NULL AUTO_INCREMENT,
  `quescontext` varchar(255) DEFAULT NULL,
  `ansone` varchar(255) DEFAULT NULL,
  `anstwo` varchar(255) DEFAULT NULL,
  `ansthree` varchar(255) DEFAULT NULL,
  `ansfour` varchar(255) DEFAULT NULL,
  `rightans` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`quesid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `newsid` int(11) NOT NULL AUTO_INCREMENT,
  `newsclass` varchar(255) NOT NULL,
  `newstitle` varchar(255) DEFAULT NULL,
  `newsauthor` varchar(255) DEFAULT NULL,
  `newstime` datetime DEFAULT NULL,
  `newsabstract` text,
  `newstext` longtext,
  `newscover` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`newsid`),
  KEY `classname` (`newsclass`),
  CONSTRAINT `classname` FOREIGN KEY (`newsclass`) REFERENCES `classfornews` (`className`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for managerinfo
-- ----------------------------
DROP TABLE IF EXISTS `managerinfo`;
CREATE TABLE `managerinfo` (
  `manaid` varchar(11) NOT NULL,
  `manapass` varchar(255) NOT NULL,
  PRIMARY KEY (`manaid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ordertable
-- ----------------------------
DROP TABLE IF EXISTS `ordertable`;
CREATE TABLE `ordertable` (
  `orderid` int(11) NOT NULL AUTO_INCREMENT,
  `newordertime` datetime DEFAULT NULL,
  `payordertime` datetime DEFAULT NULL,
  `doneordertime` datetime DEFAULT NULL,
  `orderstate` int(255) NOT NULL,
  `userid` int(11) NOT NULL,
  `price` double(10,0) DEFAULT NULL,
  `addressnum` int(11) NOT NULL,
  `yuyue` varchar(255) NOT NULL,
  PRIMARY KEY (`orderid`),
  KEY `order_userid` (`userid`),
  CONSTRAINT `order_userid` FOREIGN KEY (`userid`) REFERENCES `userinfo` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for trashinfo
-- ----------------------------
DROP TABLE IF EXISTS `trashinfo`;
CREATE TABLE `trashinfo` (
  `trashid` int(11) NOT NULL AUTO_INCREMENT,
  `trashname` varchar(255) NOT NULL,
  `trashclass` int(255) DEFAULT NULL,
  `classcity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`trashid`),
  KEY `trash_city` (`classcity`),
  KEY `trash_class` (`trashclass`),
  CONSTRAINT `trash_city` FOREIGN KEY (`classcity`) REFERENCES `trycity` (`cityname`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `trash_class` FOREIGN KEY (`trashclass`) REFERENCES `citytrashclass` (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for trycity
-- ----------------------------
DROP TABLE IF EXISTS `trycity`;
CREATE TABLE `trycity` (
  `cityid` int(11) NOT NULL AUTO_INCREMENT,
  `provincename` varchar(255) NOT NULL,
  `cityname` varchar(255) NOT NULL,
  PRIMARY KEY (`cityid`),
  KEY `cityname` (`cityname`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) NOT NULL,
  `upass` varchar(255) NOT NULL,
  `uemail` varchar(255) DEFAULT NULL,
  `sex` varchar(255) NOT NULL,
  `state` int(11) NOT NULL,
  `repoints` double(11,0) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
