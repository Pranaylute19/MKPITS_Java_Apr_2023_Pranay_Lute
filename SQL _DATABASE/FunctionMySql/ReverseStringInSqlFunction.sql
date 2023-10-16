-- Problem Statement 3: String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.

delimiter //
create function StringReversal()
returns char(10) deterministic 
  begin 
  declare reversedchar char (10) ;
  set reversedchar='pranay';
return reverse(reversedchar);
  end //
   delimiter ;
   
   
select StringReversal()  -- call athe function
