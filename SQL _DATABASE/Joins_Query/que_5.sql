//(5) Retrieve the film titles rented by the customer with customer_id 100.
select*from film  
select*from inventory 
select * from rental     
select* from customer
select title from film join inventory on film.film_id=inventory.film_id join 
rental on rental.inventory_id=inventory.inventory_id join customer on 
rental.customer_id=customer.customer_id where customer.customer_id=100