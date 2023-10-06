-- Find the total revenue generated for each month

select * from payment

select month(payment_date),sum(amount) from payment
group by month(payment_date) 

