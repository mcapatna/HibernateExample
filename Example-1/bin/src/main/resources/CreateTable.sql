DROP TABLE IF EXISTS gameofthronegreathouses;
CREATE TABLE gameofthronegreathouses (
  houseId int(11) NOT NULL DEFAULT '0',
  name varchar(255) DEFAULT NULL,
  motto varchar(255) DEFAULT NULL,
  commonSaying varchar(255) DEFAULT NULL,
  region varchar(255) DEFAULT NULL,
  generalMark varchar(255) DEFAULT NULL,
  PRIMARY KEY (houseId)
);
commit;