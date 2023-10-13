-- get the specific sum payment of customer 

delimiter //
create procedure getCustomerTotalAmount(In Cust_id int)
begin
	select sum(amount) from payment where customer_id=cust_id ;
END
//
DELIMITER ;



call getCustomerTotalAmount(3)

