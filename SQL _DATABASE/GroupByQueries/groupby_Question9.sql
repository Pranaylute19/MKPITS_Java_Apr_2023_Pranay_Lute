--  Retrieve the total revenue generated for each city.


select city ,sum(amount) from payment join rental on rental.rental_id=payment.rental_Id
join inventory on inventory.inventory_id=rental.inventory_id 
join customer on customer.customer_id=rental.customer_id 
JOIN address ON address.address_id =customer.address_id
JOIN city ON city.City_ID =address.city_id
GROUP BY   city ;