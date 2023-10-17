-- Problem Statement 1: Retrieve Customer Names and Addresses
-- Create a cursor to retrieve the names and addresses of all customers from the Sakila database.
create table MyNewtable2(firstname varchar(20),addd varchar(40))

select * from MyNewtable2

drop procedure RetrieveName
delimiter //
create procedure RetrieveName()
begin 
declare done int ;
declare f_name varchar(30);
declare addd varchar (40);
	declare Mycursor cursor for      				        -- declare the cursor
        select first_name , address from customer join address 
        on address.address_Id=customer.address_id ;    	    -- retreive the data from actor
        declare continue handler for not found set done =1;		
        open Mycursor ;										-- open the cursor
        label: loop 										-- using loop
			fetch Mycursor into F_name, addd;			-- fetch the cursor and insert into delare variable 
            insert into MyNewtable2 values (F_name,addd);	-- insert the data into new table 
							
            if done=1 then									-- condition apply for stop the loop 
             leave label;
            end if;
		end loop;
        close Mycursor;
end //
delimiter ;

call RetrieveName()