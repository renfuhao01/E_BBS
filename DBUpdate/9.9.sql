CREATE TABLE `user` (
  `userid` varchar(36) CHARACTER SET utf8 NOT NULL,
  `userName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `pwd` varchar(16) CHARACTER SET utf8 NOT NULL,
  `reg_date` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `latest_login` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `level` int(2) DEFAULT '0',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;