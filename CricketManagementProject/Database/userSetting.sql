create database userSetting

use userSetting
drop table updateprofile
create table updateprofile(
	user_id varchar(20),
    first_name varchar(20),
    middle_name varchar(20),
    last_name varchar(20),
    email varchar(20),
    DOB date,
    mobile int,
    gender varchar(10),
    address_id int,
    country_id int ,
    constraint b_key foreign key(country_id) references country(country_id),
    constraint F_key foreign key (address_id) references address(address_id)
)
select * from updateprofile
show tables
create table address(
	address_id int primary key,
    address varchar(100),
    district varchar(20),
    city_id int,
     constraint a_key foreign key (city_id) references city(city_id)
)
create table city(
	city_id int primary key,
    city_name varchar(10),
    state_id int,
    constraint c_key foreign key(state_id) references state(state_id)
)
create table state (
	state_id int primary key,
    state_name varchar(20),
    country_id int,
    constraint s_key foreign key (country_id) references country(country_id)
)
create table country(
	country_id int primary key,
    country_name varchar(20)
)
drop table cuntry
