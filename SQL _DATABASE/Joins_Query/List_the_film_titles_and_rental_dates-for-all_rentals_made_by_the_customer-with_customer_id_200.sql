-- List the film titles and rental dates for all 
-- rentals made by the customer with customer_id 200.
select title , rental_date from film join inventory 
on inventory.film_id=film.film_id join rental 
on rental.inventory_id=inventory.inventory_id join customer 
on customer.customer_id=rental.customer_id where customer_id='100'

