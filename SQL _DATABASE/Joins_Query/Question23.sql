-- Get the first name, last name, and email of customers who have rented more than 10 films.

select first_name, last_name ,email from customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id where customer.first_name >10