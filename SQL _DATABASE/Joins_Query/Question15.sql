-- Retrieve the rental date and return date for each rental made by customer "Richard Davis

select return_date, rental_date , first_name from film  join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id join customer
 on rental.customer_id=customer.customer_id where customer.first_name="richard"