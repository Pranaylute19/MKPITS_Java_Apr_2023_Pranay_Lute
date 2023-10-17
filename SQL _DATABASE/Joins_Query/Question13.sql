-- Get the names of all customers who have rented more than 5 films.

select first_name,rental.customer_id from customer join rental 
on  customer.customer_id=rental.customer_id join inventory 
on inventory.inventory_id=rental.inventory_id join film 
on film.film_id=inventory.film_id
group by customer_id
having count(rental_id)>39
