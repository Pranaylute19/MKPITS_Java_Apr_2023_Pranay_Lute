
 
 -- (10) Retrieve the rental date and rental duration for each rental made by customer
--  "Linda Williams".

  select*from film  
  select*from inventory 
  select * from rental    
  select* from customer
  
  select rental_date,rental_duration from film join inventory on 
  inventory.film_id=film.film_id join rental on 
  rental.inventory_id=rental.inventory_id join customer on 
  customer.customer_id=rental.customer_id where first_name='Linda' and last_name='Williams'
 
