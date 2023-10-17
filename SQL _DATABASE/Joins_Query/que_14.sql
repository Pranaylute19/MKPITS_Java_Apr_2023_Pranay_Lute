
 
 -- (14) List the film titles and rental dates for all rentals made by the customer
 -- with customer_id 400.
   select*from film 
   select*from inventory 
   select* from rental 
   select* from customer
   
  select title,rental_date from film join inventory on 
  inventory.film_id=inventory.film_id join rental on 
  rental.inventory_id=rental.inventory_id join customer on 
  customer.customer_id=rental.customer_id 
  where customer.customer_id=400
 
   select title,rental_date from film join inventory on 
   inventory.film_id=inventory.film_id join rental on 
   rental.inventory_id=rental.inventory_id join customer on 
   customer.customer_id=inventory.customer_id 
   where customer.customer_id=400
 LIMIT 0, 1000	Error Code: 1054. Unknown column 'inventory.customer_id' in 'on clause'	0.000 sec
