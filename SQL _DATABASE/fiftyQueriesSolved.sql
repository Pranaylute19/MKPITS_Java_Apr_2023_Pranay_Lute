use sakila
show tables
select * from customer
select * from rental
select * from film_actor
select first_name , title from customer join film 
select rental_date,return_date , first_name,last_name from customer join rental where customer.customer_id=rental.customer_id
select * from actor
select * from film
select * from category
 select first_name , last_name from actor join film_actor on actor.actor_id=film_actor.film.id join film on actor.actor_id= film.film_id where title="Chamber Italian"
select title from film join customer on film.customer_id=customer.customer_id where customer_id=100
select title from film join inventory on film.film_id=inventory.film_id join rental on rental.inventory_id=inventory.inventory-id join rental.customer_id=customer.customer_id