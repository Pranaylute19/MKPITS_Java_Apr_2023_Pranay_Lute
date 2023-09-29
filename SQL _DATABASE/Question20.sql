-- Display the rental date and rental duration for each rental made by customer "Karen Smith"

select rental_date ,rental_duration,first_name , last_name from customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id where customer.first_name="karen"