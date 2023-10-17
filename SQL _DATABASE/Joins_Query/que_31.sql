
 
 -- (31) Get the film titles and rental dates for all rentals made on July 25, 2005.
    select* from customer 
	select* from rental where date(rental_date)='2005-05-26'
    select* from inventory
    select* from film 
    
	select title,rental_date from film join inventory on inventory.film_id=film.film_id
    join rental on rental.inventory_id=inventory.inventory_id join 
    customer on customer.customer_id=rental.customer_id where date(rental_date)='2005-07-25'
    