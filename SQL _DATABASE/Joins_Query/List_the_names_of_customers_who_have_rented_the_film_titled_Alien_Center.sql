-- List the names of customers who have rented the film titled "Alien Center"

select first_name , title from customer join rental 
on rental.customer_id=customer.customer_id join inventory 
on inventory.inventory_id=customer.customer_id join film
on film.film_id=inventory.film_id where title="Alien Center"