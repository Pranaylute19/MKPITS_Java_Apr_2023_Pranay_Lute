-- 9. Highly rented films:
-- Identify films that have been rented more than 30 times.

select  title,count(rental_id)from film 
join inventory on film.film_id=inventory.film_id 
join rental on rental.inventory_id=inventory.inventory_id
group by film.film_id having count(rental_id)>30
