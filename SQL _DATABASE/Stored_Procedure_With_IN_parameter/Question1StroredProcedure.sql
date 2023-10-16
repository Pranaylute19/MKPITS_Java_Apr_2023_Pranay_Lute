select totalOrderprize from TotalOrderValueCalculation(10,25)

CREATE TABLE TotalOrderValueCalculation(quantity int,price int)
drop table TotalOrderValueCalculation
select TotalOrderValueCalculation(10,2)

delimiter //
create FUNCTION TotalOrderValueCalculation(quantity int,price int) 
RETURNS INT  DETERMINISTIC
BEGIN
	declare totalOrderprize int ;
    set totalOrderprize=quantity*price;
RETURN totalOrderprize;
END //
delimiter ;


drop function TotalOrderValueCalculation