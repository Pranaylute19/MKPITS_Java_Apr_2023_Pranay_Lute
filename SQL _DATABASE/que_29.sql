
 
 -- (29) List the film titles and rental dates for all rentals made by
 -- customer "Michael Davis".
    select* from customer 
	select* from rental 
    select* from inventory
    select* from film
    
	select title,rental_date from film join inventory
    on inventory.film_id=film.film_id join rental on
    rental.inventory_id=inventory.inventory_id join customer on
    customer.customer_id=rental.customer_id 
    where customer.first_name='Michael' and customer.last_name='Davis'
 
