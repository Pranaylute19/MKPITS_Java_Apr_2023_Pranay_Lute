
 
 -- (26)Display the film titles rented by the customer with customer_id 700.
    select* from customer
	select* from rental 
    select* from inventory
    select* from film
    
	select title from film join inventory 
     on film.film_id=inventory.film_id join rental on
     rental.inventory_id=inventory.inventory_id join customer on
     customer.customer_id=rental.customer_id where customer.customer_id=700
 
