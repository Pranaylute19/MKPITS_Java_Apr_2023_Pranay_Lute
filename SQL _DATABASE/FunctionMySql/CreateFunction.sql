select * from payment
drop function callGst
Delimiter //
CREATE FUNCTION CALLGST(amt DECIMAL (5,2))
RETURNS DECIMAL(5,2) DETERMINISTIC
BEGIN
DECLARE gst int;
set gst = amt*0.18;
return gst;
end //
  DELIMITER ;
--   use sakila
  select payment_id,amount,callgst(amount) as gst, amount + callgst(amount) from payment;