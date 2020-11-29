CREATE TABLE `users` (
  `username` varchar(75) NOT NULL,
  `password` varchar(150) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
)

CREATE TABLE `authorities` (
  `id` mediumtext NOT NULL,
  `username` varchar(75) NOT NULL,
  `authority` varchar(50) NOT NULL,
  KEY `fk_authorities_users` (`username`),
  CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
)


