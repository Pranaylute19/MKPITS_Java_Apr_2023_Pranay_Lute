DELIMITER //
CREATE PROCEDURE while_loop()
BEGIN
 DECLARE counter INT DEFAULT 1;
 
  WHILE counter <= 10 DO
    -- Your loop logic goes here
    -- For example, you can print the counter value
    SELECT counter;
   
    -- Increment the counter
    SET counter = counter + 1 ;
  END WHILE;
END
// DELIMITER ;