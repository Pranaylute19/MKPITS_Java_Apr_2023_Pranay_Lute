create database Khatabook
create table customerDetail(
customer_id varchar(20) primary key,
Auth_password varchar(20),
customer_name varchar(20),
address varchar(20),
balance varchar(20)
)
drop table customerDetail
select * from customerDetail