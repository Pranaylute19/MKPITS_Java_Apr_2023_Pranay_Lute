Retrieve the names of all customers and the titles of the films they have rented.

select First_name ,title from film join inventory 
on film.film_id=inventory.film_id join rental 
on inventory.inventory_id=rental.inventory_id join customer 
on customer.customer_id=rental.customer_id