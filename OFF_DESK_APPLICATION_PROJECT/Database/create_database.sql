use offdeskapplication
show tables
select * from registration
drop table registration
create table registration(
Employee_id int primary key Auto_increment,
Name varchar(20),
Designation varchar(20),
Date_of_joining date,
gender varchar(10)
)
insert into registration values (
1,"pranay","engineer","2023-12-12","male"
)