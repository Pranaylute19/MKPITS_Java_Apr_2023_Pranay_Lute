-- Identify Inactive Customers
-- Develop a stored procedure that identifies inactive customers who haven't made any rentals in the last six months.
-- The procedure should output a list of these customers along with their contact information.

select active,customer_id  ,max(last_update) from customer where active='0' 
select last_update from customer 

delimiter //
create procedure CustomerIdentifeier()
	begin 
    
    End 
    //
 delimiter   
