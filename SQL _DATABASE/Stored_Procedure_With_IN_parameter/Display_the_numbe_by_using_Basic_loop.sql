-- (1)  Display the number by using Basic loop
 drop procedure displayNumberByUsingBasicLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure displayNumberByUsingBasicLoop1(n int)
begin
   declare counter int ;
   declare string varchar(50);
    set strng="";
    set counter=1;
   
   label: loop
    set strng= concat(strng,counter,",");
    set counter=counter+1; 
   
    if counter>n then
    leave label;
    end if;
    end loop label ;
      select string;
end
  //
  delimiter ;

  call displayNumberByUsingBasicLoop1(5)