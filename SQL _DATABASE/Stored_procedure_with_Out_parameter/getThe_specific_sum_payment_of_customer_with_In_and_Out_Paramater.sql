-- get the specific sum payment of customer with In and Out Paramater

delimiter //
create procedure SumOfAmount(In num int,out sumAmount int)
begin
	select sum(amount) into sumAmount from payment where customer_id=num ;
END
//
DELIMITER ;

drop procedure SumOfAmount

CALL SumOfAmount(6,@sumAmount)

select @sumAmount
    
    