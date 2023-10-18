create database studentDetailing
use studentDetailing
create table student(physics int,chemistry int ,maths int ,total int )
insert into student values(40,23,44,(physics+chemistry+maths))
select * from student 
drop table student

-- first trigger 
delimiter //
create trigger MarksWithAfterInsertTotal after insert  on student for each row 
 begin 
 declare physics int;
 declare chemistry int;
 declare maths int ;
 declare total int ;
 update student 
	set physics=new.physics ;
    set chemistry=new.chemistry;
    set maths=new.maths;
    set total=physics+chemistry+maths ;
end //
delimiter ;


drop trigger MarksWithAfterInsertTotal
-- another trigger 

delimiter //
create trigger updateMarksWithAfterupdateTotal after update on student  for each row 
begin 
 declare physics int;
 declare chemistry int;
 declare maths int ;
 declare total int ;
 update student 
	set physics=new.physics ;
    set chemistry=new.chemistry;
    set maths=new.maths;
    set total=physics+chemistry+maths ;
end //
    delimiter ;
