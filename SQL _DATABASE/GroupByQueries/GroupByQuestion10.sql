-- Calculate the count of rentals for each film language

select * from film
select count(rental_id),language_id from rental 
join inventory on inventory.inventory_id =rental.inventory_id 
join film on film.film_id=inventory.film_id
group by language_id