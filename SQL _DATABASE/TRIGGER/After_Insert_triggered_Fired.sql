-- Create the database of shop and created the two tables product and sale 
-- and use the after insert (TIMING DML) use : ON THIS PROBLEM EXISTING RECORD UPDATE AFTER THE TRIGGER FIRED THEN INSERT 
-- THE REOCORD ...THEN WE GET THE ANSWER AFTER IMSERT 

CREATE DATABASE SHOP
USE SHOP

CREATE TABLE PRODUCT(Product_id int, productName varchar(20),prize int ,quantity int)
create table sale(sale_id int ,Product_id int ,quantity int)

drop table sale
insert into PRODUCT values(1,'soap',30,20)

delimiter //
create trigger after_sale_trigger after insert on sale for each row
 begin
	update product
		set quantity=quantity-new.quantity
        where product_id=new.product_id ;
        
 end //
 delimiter ;
 
 insert into sale values(1,1,5)

 
 drop trigger after_sale_trigger
 
 select * from sale
 select * from product
 drop table sale

