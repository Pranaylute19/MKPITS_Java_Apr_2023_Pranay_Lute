create database IDFCBank
use IDFCBank
create table balance(
	customer_id varchar(20),
    Password varchar(20),
    Name varchar(20),
    Mobile_number varchar(20),
    Balance int
)
insert into balance values(
	'15','1234','pradnya','987657704',6000
)
     select * from balance       