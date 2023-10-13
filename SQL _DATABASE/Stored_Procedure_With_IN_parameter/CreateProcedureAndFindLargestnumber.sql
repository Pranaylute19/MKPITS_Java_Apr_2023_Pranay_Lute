DELIMITER //
CREATE PROCEDURE check_gretest_number_procedure(numberfirst int,num2 int,num3 int)
BEGIN
declare number int;
if(numberfirst>num2) then
if(numberfirst>num3) then
   set number=numberfirst ;
  else
   set number=num3;
 end if;
  else
if (num2>num3) then
set number=num2;
else
set number=num3;
end if;
end if;
select "greatest number is",number;
END
//
DELIMITER ;

call check_gretest_number_procedure(100000,2000,400);
