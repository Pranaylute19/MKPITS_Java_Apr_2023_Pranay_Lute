create database studenDetail
use studenDetail

select * from rollnumber

create table rollnumber( rollnumber int,physics int,chemistry int, chem int)
drop table biology
create table ( )
create table ()
create table ()

insert into rollnumber values(5,70,50,84)
insert into physics values(10)
insert into chemistry values(30)
insert into biology values (70)

select * from
delimiter //
create procedure rollnumty(In rollnu int)
begin
    DECLARE counter Int ;
     set counter =5;
    select max(rollnumber) into counter from Roll_number ;
   
	while counter<=10 Do
    insert into rollnumber values(counter);
     SET counter = counter + 1 ;
    END while ;
    End
    //
    delimiter ;

call rollnumty(15)

select * from rollnumber

