--  Determine the count of rentals for each film.
select * from rental
select * from film

select title,count(rental_id) from rental join inventory 
on inventory.inventory_id=rental.inventory_id join film
on film.film_id=inventory.film_id 
group by title
