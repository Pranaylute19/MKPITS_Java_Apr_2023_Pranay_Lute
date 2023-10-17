--  High revenue categories:
-- Find categories with an average rental revenue greater than $10.

select rental.rental_id, sum(amount) as "rental_revenue" from rental join payment on
rental.rental_id = payment.rental_id group by rental_id having rental_revenue>10


 select name ,language_id from language
 group by name
 having language_id>50
 
 select language.language_id,title,name, count(film_id) as languages from film join language on
film.language_id = language.language_id group by language_id having languages > 50