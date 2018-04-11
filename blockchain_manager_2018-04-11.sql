# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.21-log)
# Database: blockchain_manager
# Generation Time: 2018-04-11 08:38:59 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table member
# ------------------------------------------------------------

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `app_id` varchar(255) DEFAULT NULL,
  `group_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;

INSERT INTO `member` (`id`, `create_time`, `update_time`, `ip`, `name`, `app_id`, `group_id`)
VALUES
	(1,'2018-03-19 14:37:26','2018-03-19 14:37:28','192.168.1.75','maida','wolf','1'),
	(2,'2018-03-19 14:37:26','2018-03-19 14:37:28','192.168.1.121','mingyi','mingyi','1');

/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table member_group
# ------------------------------------------------------------

DROP TABLE IF EXISTS `member_group`;

CREATE TABLE `member_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `group_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `member_group` WRITE;
/*!40000 ALTER TABLE `member_group` DISABLE KEYS */;

INSERT INTO `member_group` (`id`, `create_time`, `update_time`, `group_id`, `name`)
VALUES
	(1,'2018-03-19 14:37:08','2018-03-19 14:37:10','1','group1');

/*!40000 ALTER TABLE `member_group` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table permission
# ------------------------------------------------------------

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `group_id` varchar(255) DEFAULT NULL,
  `operation` tinyint(4) NOT NULL,
  `public_key` varchar(255) DEFAULT NULL,
  `table_name` varchar(255) DEFAULT NULL,
  `permission_type` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `permission` WRITE;
/*!40000 ALTER TABLE `permission` DISABLE KEYS */;

INSERT INTO `permission` (`id`, `create_time`, `update_time`, `group_id`, `operation`, `public_key`, `table_name`, `permission_type`)
VALUES
	(1,'2018-03-19 14:37:26','2018-03-19 14:37:26','1',2,'*','message',2);

/*!40000 ALTER TABLE `permission` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
