-- Display the names of customers who have rented the film titled "Ocean Luke"

select first_name from customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id where title="Ocean luke"