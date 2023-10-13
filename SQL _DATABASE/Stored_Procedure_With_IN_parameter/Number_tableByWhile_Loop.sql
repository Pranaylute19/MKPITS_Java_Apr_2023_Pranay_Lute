DELIMITER //

CREATE  PROCEDURE NumberTable(In WhichTAblewant_to int)
BEGIN
 DECLARE counter Int DEFAULT 1;
 
  WHILE counter <= 10 DO
   
    SELECT WhichTAblewant_to*counter;
   
    SET counter = counter + 1;
  END WHILE;
END
// DELIMITER ;
call NumberTable(3);
drop procedure NumberTable;