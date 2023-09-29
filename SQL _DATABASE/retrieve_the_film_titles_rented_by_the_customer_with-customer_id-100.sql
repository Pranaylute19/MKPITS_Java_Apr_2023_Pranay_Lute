use sakila
-- retrieve the film titles rented by the customer with customer_id 100.
select title from film join inventory 
on inventory.film_id=film.film_id join rental 
on rental.inventory_id=inventory.inventory_id join customer 
on customer.customer_id=rental.customer_id  where customer_id="100"