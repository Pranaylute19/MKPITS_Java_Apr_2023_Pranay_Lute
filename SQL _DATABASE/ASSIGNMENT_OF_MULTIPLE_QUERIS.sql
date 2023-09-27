use sakila
show tables
select * from customer
select first_name,last_name , email from customer 
show tables
select * from inventory
select count(distinct film_id) from inventory
show tables
select * from rental where rental_id=1
select title,length from film
select *  from staff where staff_id=1
select * from customer_list where city='kabul'
select * from rental  where return_date is Null order by rental_date desc
select  * from rental where customer_id=130
