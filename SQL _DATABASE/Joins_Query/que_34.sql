
 
 -- (34) Display the names of customers who have rented the film titled "Riders Zorro".
     select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select first_name,last_name,email from customer join rental 
 on rental.customer_id= customer.customer_id join inventory 
 on  inventory.inventory_id=rental.inventory_id join film
 on film.film_id=inventory.film_id where title="Riders Zorro"
    