-- Problem Statement 2: Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and
-- calculates their current age in years.

delimiter //
 create function CalculateAge(DateOfBirth date)
 Returns int deterministic
 begin 
	declare ageCalculate date;
    set ageCalculate=CURRENT_DATE()-DateOfBirth;
    return ageCalculate;
 end //
 delimiter ;
 drop function CalculateAge
 select CalculateAge(19-07-1998)
 select current_date()