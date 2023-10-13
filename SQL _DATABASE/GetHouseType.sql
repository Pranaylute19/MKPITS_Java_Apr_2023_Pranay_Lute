DELIMITER //
create procedure GetHouseType( In roomNumbers int)
BEGIN 
if (roomNumbers<5) then
    select "2 BHK";
  else if (roomNumbers <6) then
           select "3 BHK";
  else if(roomNumbers <7) then 
			select "4 BHK";
       end if;
       end if ;
	end if ; 
   END
  //
 DELIMITER ;
 
 drop procedure GetHouseType;
call GetHouseType(4);

