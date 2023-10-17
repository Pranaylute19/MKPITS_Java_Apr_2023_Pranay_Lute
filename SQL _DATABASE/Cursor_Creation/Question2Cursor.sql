-- Problem Statement 2: Calculate Total Rental Fees for a Customer
-- Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.


create table totalRentalFee(first_n varchar(20),addn varchar(40))

delimiter //
create procedure RentalFeeCalculate()
 begin
		declare f_name varchar(20);
        declare addres varchar(40);
        declare done int;
		declare mycursor cursor for
        
         select customer.customer_id , sum(amount) from payment join customer
         on customer.customer_id=payment.customer_id group by customer_id;
         
         declare continue handler for not found set done =1;
         
          open Mycursor ;	
          label:loop 
          fetch mycursor into f_name,addres ;
          insert into totalRentalFee values(f_name,addres);
          
          if done=1 then
          leave label ;
          end if ;
          end loop ;
          close Mycursor;
 end //
 delimiter ;
 
 call RentalFeeCalculate()

select * from totalRentalFee