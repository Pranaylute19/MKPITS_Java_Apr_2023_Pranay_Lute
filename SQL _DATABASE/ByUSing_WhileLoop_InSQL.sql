DELIMITER //

CREATE  PROCEDURE new_while_loop1()
BEGIN
 DECLARE counter Int DEFAULT 1;
 
  WHILE counter <= 10 DO
   
    SELECT counter;
   
    SET counter = counter + 1;
  END WHILE;
END
// DELIMITER ;
call new_while_loop1;