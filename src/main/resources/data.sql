DROP TABLE IF EXISTS PRODUCT;
 
CREATE TABLE PRODUCT(
  id INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  type VARCHAR(250) NOT NULL);

INSERT INTO PRODUCT(id,name,type) VALUES
(1,'Ed Sheeran','Music'),
(2,'Shakira','Music'),
(3,'Niki','Music'),
(4,'Spiderman','Game'),
(5,'Ironman','Game'),
(6,'Superman','Game'),
(7,'Spiderman','Book'),
(8,'Ironman','Book'),
(9,'Superman','Book');

DROP TABLE IF EXISTS USER;
 
CREATE TABLE USER(
  id INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL);

INSERT INTO USER(id,name) VALUES
(1,'Tom'),
(2,'Dick'),
(3,'Harry');

DROP TABLE IF EXISTS BASKET;

CREATE TABLE BASKET(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    PRODUCT_ID INT,
    USER_ID INT); 

ALTER TABLE BASKET
  ADD CONSTRAINT UQ_BASKET UNIQUE(PRODUCT_ID, USER_ID);
