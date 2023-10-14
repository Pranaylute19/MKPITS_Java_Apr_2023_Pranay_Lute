-- 2. Determine the count of rentals for each customer.

select  rental.customer_id ,count(rental_id) from rental join customer
on customer.customer_id=rental.customer_id
group by customer_id