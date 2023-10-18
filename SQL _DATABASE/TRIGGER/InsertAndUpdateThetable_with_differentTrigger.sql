-- create and update the table 

create database studentDetailing
use studentDetailing
create table student(physics int,chemistry int ,maths int )

 insert into student values(40,23,44)
 select * from totalMArk
drop table student
create table totalMArk (totalmark int)

drop table totalMArk
    
delimiter //
create trigger MarksWithAfterInsertTotal after insert on student for each row
 begin
		insert into totalmark values(new.physics+new.chemistry+new.maths);
        
 end //
 delimiter ;
 drop trigger MarksWithAfterInsertTotal
 
 -- update the table
 delimiter //
create trigger UpdateWithAfterInsertTotal after update on student for each row
 begin
        update student
		set physics=new.physics+10,chemistry=new.chemistry+10,maths=new.maths+10
        where rollNo=new.rollNo ;
 end //
 delimiter ;


