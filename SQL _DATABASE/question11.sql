-- List the film titles and rental dates for all rentals made by customer "Mary Johnson".

select title , first_name from film join  inventory
 on film.film_id=inventory.film_id join rental 
 on rental.inventory_id=inventory.inventory_id join customer 
 on rental.customer_id=customer.customer_id where first_name="Mary" or last_name="johnson"