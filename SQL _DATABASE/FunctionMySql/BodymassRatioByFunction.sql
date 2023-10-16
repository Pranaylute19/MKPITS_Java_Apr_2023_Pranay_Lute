-- Problem Statement 4: Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) 
-- and height (in meters) as input and calculates their BMI.

delimiter //
create function BoyMassratio( weight int ,height decimal(5,3))
returns decimal(5,3) deterministic
 begin
 declare BMI decimal(5,3);
	set  bmi=weight/(height*height);
 return BMI ;
 end //
 delimiter ;
 select BoyMassratio(60,1.65)
 
 drop function BoyMassratio