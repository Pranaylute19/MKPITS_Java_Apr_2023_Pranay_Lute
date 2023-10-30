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
create table Transactions(
	user_id varchar(20),
    Transaction_date date,
    Amount double,
    Amount_type varchar(20),
     FOREIGN KEY (user_id) REFERENCES AccountDetails(user_id)
)
drop table Transactions
select * from Transactions
select * from AccountDetails


drop table AccountDetails