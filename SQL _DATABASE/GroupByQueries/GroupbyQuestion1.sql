 -- Determine the count of rentals for each customer.
 
 SELECT rental.customer_id,first_name ,COUNT(RENTAL_ID) FROM RENTAL JOIN CUSTOMER 
 ON CUSTOMER.CUSTOMER_ID=RENTAL.CUSTOMER_ID
 group by customer_id
 