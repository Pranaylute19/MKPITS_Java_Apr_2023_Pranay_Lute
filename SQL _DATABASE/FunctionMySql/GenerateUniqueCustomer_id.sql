-- Problem Statement 5: Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern
--  and the customer's personal details.

delimiter //
create function GenerateUniqueCode(name varchar(15),mobilenumber int(10) ,lastname varchar(15),uuid int(10))
 returns varchar(25) deterministic
 begin 
 declare initial char(25);
 SET initial = CONCAT(LEFT(name, 1), right(mobilenumber,3),LEFT(lastname, 1),left(uuid,2));
 return initial ;
 end //
 delimiter ;
 drop function GenerateUniqueCode
 
 
 select GenerateUniqueCode('pranay',776993506,'lute',702034543) as unique_id