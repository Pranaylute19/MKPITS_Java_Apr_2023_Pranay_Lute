-- Display the first name, last name, and email of customers 
-- who have rented the film titled "Dinosaur Secretary

select title from film
select first_name, last_name ,email from film  join inventory 
on film.film_id=inventory.film_id join rental 
on rental.inventory_id=inventory.inventory_id join customer
 on rental.customer_id=customer.customer_id where title="academy dinosaur"