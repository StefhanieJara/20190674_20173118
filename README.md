# 20190674_20173118
Laboratorio 7

mysql


select * from (select a.actor_id, concat(first_name," ",last_name) as "Nombre",count(a.actor_id) as "N° Peliculas" from actor a
inner join film_actor f on (a.actor_id= f.actor_id) group by f.actor_id) as t
inner join  (select a.actor_id, count(a.actor_id) as "N° Categorias" from actor a 
inner join film_actor f on (a.actor_id= f.actor_id) 
inner join film fi on (f.film_id= fi.film_id)
inner join film_category ca on (fi.film_id= ca.film_id)
inner join category cat on (ca.category_id=cat.category_id) group by a.actor_id) as t2 on (t2.actor_id= t.actor_id);
