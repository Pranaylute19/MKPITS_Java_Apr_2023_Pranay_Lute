-- List the rental date and return date for all rentals made by customer "Jennifer Lee".

select rental_date, return_date , first_name from rental join customer on 
customer.customer_id=rental.customer_id where first_name="jennifer"