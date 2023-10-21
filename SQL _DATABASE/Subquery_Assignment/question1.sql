-- 1. Find customers who rented a specific film:
-- Retrieve the names of customers who rented the film with the title ="ATTACKS HATE'.


select first_name, last_name,title from customer join rental on
customer.customer_id = rental.customer_id join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id where title="ATTACKS HATE";


select first_name, last_name,title from customer join rental on
customer.customer_id = rental.customer_id join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id where title in (select title from film where title="ATTACKS HATE");