create database Bank
use Bank
create table AccountDetails(
	user_id varchar(20) primary key,
    Authontication varchar (20),
    name varchar(20),
    Address varchar(20),
    City varchar(10),
    mobile_number varchar(20),
    Balance double
) 
drop table AccountDetails
select * from AccountDetails
drop table AccountDetails