create database Contry
use country
drop database Contry
create database country
use country


create table state (
	maharashtra char(10) ,
    Madhyapradesh char(10) ,
    banglore char(10) ,
    CountryCode int
)
drop table state
create table state (
	maharashtra char(10) ,
    Madhyapradesh char(10) ,
    banglore char(10) ,
    CountryCode int primary key
)
insert into state values ('10000','8000','90000',91)
insert into state values ('10000','8000','90000',91)
insert into state values ('10000','8000','90000',91)
create table division(
wardha char (10),
nagpur char(10),
bhandara char (10),
countrycode int ,
foreign key (countrycode) references state(countrycode)
)
insert into division values ('90000','9800','8800',91)
select * from division
select * from state
insert into state values ('90000','9800','8800',90)
insert into state values ('21000','95600','9800',92)
select * from state
UPDATE STATE  SET Madhyapradesh=888 WHERE Madhyapradesh=9800
USE COUNTRY
DELETE FROM DIVISION WHERE COUNTRYCODE='90000'

SELECT * FROM DIVISION WHERE BHANDARA='NULL'