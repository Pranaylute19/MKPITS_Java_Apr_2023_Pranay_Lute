-- (1)  Display the number by using Basic loop
 drop procedure displayNumberByUsingBasicLoop1;
   -- ============ create a store procedure ============
   Delimiter //
   create procedure displayNumberByUsingBasicLoop1(n int)
begin
   declare counter int ;
     set counter=1;
   
   label: loop
   
    if counter>n then
      select "hello";
       set counter=counter+1; 
    leave label;
  
    end if;
    end loop label ;
end
  //
  delimiter ;

  call displayNumberByUsingBasicLoop1(5)