show tables
show databases
use sakila

 create table MyNewtable(name varchar(250),last_name varchar(250));
 drop table MyNewtable
 select * from MyNewtable

drop procedure MyCursorProcedure
delimiter //
create procedure MyCursorProcedure()
begin

	declare F_name varchar(250);
    declare l_name varchar(250);
    declare done int;
		declare Mycursor cursor for 
         select first_name ,last_name from actor ;
         
        declare continue handler for not found set done =1;
        open Mycursor ;
        label: loop 
			fetch Mycursor into F_name, l_name ;
            insert into MyNewtable values (F_name,l_name);
            if done=1 then
             leave label;
            end if;
		end loop;
        close Mycursor;
end //
delimiter ;

call MyCursorProcedure() 