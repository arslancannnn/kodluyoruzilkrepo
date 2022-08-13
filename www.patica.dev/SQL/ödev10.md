# 1. SORU
 
````SQL

SELECT city, country FROM city 
LEFT JOIN country ON city.country_id = country.country_id;

````

# 2. SORU
 
````SQL

SELECT p.payment_id,c.first_name,c.last_name 
FROM customer c  
RIGHT JOIN payment p ON p.customer_id  = c.customer_id;

````

# 3. SORU
 
````SQL

SELECT r.rental_id,c.first_name,c.last_name 
FROM customer c 
FULL JOIN rental r ON r.customer_id  = c.customer_id
ORDER BY r.rental_id;

````
