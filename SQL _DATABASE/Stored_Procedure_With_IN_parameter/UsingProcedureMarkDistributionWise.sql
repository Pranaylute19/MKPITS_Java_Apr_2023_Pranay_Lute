DELIMITER //
create procedure marklistCheck( In marks int,In Out_OfMarks int)
BEGIN 
if marks<50 and Out_OfMarks=60 then
    select "Fail";
  else if (marks >=50 and Out_OfMarks=60) then
           select "pass";
       end if;
       end if ;
   
    END
  //
 DELIMITER ;
 
 drop procedure marklistCheck;
call marklistCheck(40,60);

