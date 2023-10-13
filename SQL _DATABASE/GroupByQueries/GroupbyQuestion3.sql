-- Calculate the average rental duration (in days) for each film.

use sakila
select film.film_id,title,round(avg(datediff(return_date,rental_date))) as Avgdays
 from film join inventory
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id
group by film_id
order by AvgDays desc

-- (avg) use for the finf ]d the average date between them
-- (datdiff) use for the find the differene of date

DELIMITER //
create procedure msqlFirstprocedure()
BEGIN
select film.film_id,title,round(avg(datediff(return_date,rental_date))) as Avgdays
from film join inventory
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id
group by film_id
order by AvgDays desc;
END
  //
 DELIMITER ;

call myFirstprocedure()
