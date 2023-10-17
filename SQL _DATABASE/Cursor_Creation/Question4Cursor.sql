-- Problem Statement 4: Retrieve Film Information by Category
-- Create a cursor to retrieve film details for a specific film category from the Sakila database.


create table FilmInformationByCategory(Desription varchar(250),cate_id int)


delimiter //
create procedure RetrieveFilmInfo()
begin
		declare desce varchar(250);
        declare cat_id int;
        declare done int ;
        
		declare mycursor cursor for
        select Description ,category.category_id from film join film_category on 
        film_category.film_id=film.film_id join category on
        film_category.category_id=category.category_id 
        group by Description ;
        
         declare continue handler for not found set done =1;
         open mycursor ;
         label :loop 
         fetch mycursor into desce ,cat_id ;
         insert into FilmInformationByCategory values(desce,cat_id);
          
          if done =1 then
          leave label ;
          end if ;
          end loop ;
         close mycursor ;
 end //
 delimiter ;
 
 call  RetrieveFilmInfo()
 
 select * from FilmInformationByCategory