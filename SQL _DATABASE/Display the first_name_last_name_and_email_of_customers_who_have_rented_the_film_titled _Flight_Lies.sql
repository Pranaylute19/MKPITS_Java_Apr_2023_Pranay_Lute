-- Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".

select first_name,last_name ,email ,title from customer join rental 
on rental.customer_id=customer.customer_id join inventory 
on inventory.inventory_id=customer.customer_id join film
on film.film_id=inventory.film_id where title="ACADEMY DINOSAUR"

select title from film