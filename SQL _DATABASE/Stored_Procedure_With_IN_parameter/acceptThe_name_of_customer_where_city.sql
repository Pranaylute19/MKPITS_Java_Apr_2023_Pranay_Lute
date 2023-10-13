--  accept the name of customer where city=""
 
 
 delimiter //
	create procedure GetThe_customername(In cit varchar(20))
    
    begin
        select first_name ,city from city join Address on Address.city_id=city.city_id 
        join customer  on customer.Address_id=address.address_id where city=cit ;
	End 
	//
	delimiter ;
    
    
    call GetThe_customername("abu dhabi");
    
    
     drop procedure GetThe_customername
     