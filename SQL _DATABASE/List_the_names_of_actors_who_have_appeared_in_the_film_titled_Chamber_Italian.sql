-- List the names of actors who have appeared in the film titled "Chamber Italian" 

select first_name from actor join film_actor on film_actor.actor_id=actor.actor_id join film on film.film_id=film_actor.film_id where title="Chamber Italian"