-- Get the titles of all films rented by the customer named "William Brown"

select title , first_name , last_name from film join inventory 
on inventory.film_id=film.film_id join rental 
on rental.inventory_id=inventory.inventory_id join customer 
on customer.customer_id=rental.rental_id where first_name="william" or last_name="brown"