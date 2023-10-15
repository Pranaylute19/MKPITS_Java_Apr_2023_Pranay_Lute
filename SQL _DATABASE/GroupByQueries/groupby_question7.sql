-- 7. Compute the average rental rate for each film category.


select avg(amount), film.film_id from payment join rental on rental.rental_id=payment.payment_id
join inventory on inventory.inventory_id=rental.inventory_id
join film on film.film_id =inventory.film_id
group by film_id


use  sakila





