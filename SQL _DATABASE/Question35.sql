-- Display the names of customers who have rented the film titled "Riders Zorro".

select first_name ,last_name from customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id where title="Riders Zorro"