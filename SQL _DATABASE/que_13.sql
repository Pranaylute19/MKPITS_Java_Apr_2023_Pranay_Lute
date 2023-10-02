
 
 -- (13) Get the names of all customers who have rented more than 5 films.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film 
  select first_name,last_name from customer join rental on 
  rental.customer_id=rental.customer_id join inventory on 
  inventory.inventory_id=rental.inventory_id join film on 
  film.film_id=inventory.film_id 
  where customer.first_name>=5 and customer.last_name>=5
 
   
