-- Get the film titles and rental dates for all rentals made on August 10, 2005

select title f, rental_date rom film  join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id
 where rental_date='2005-08-10 '
 
 select * from rental
 