-- List the rental date and rental duration for each rental made by customer "David Clark

select rental_date , rental_duration , first_name from film join  inventory
 on film.film_id=inventory.film_id join rental 
 on rental.inventory_id=inventory.inventory_id join customer 
 on rental.customer_id=customer.customer_id where first_name="David"