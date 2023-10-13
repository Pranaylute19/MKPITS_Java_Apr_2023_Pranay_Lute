Delimiter //
create procedure EVENODD(in numb int)
	begin 
    
    if (numb %2=0) then 
		select "even" ;
        else
         select "odd";
	end if ;
         End 
         //
          delimiter ;
          
          drop procedure EVENODD;
     
     call EVENODD(13)