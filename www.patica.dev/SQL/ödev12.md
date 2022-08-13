# 1. SORU

````SQL

SELECT COUNT(*) FROM film
WHERE length > (SELECT AVG(length) FROM film);

````

# 2. SORU

````SQL

SELECT COUNT(*) FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

````

# 3. SORU

````SQL

SELECT * FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND 
replacement_cost = (SELECT MIN(replacement_cost) FROM film);

````

# 4. SORU

````SQL

SELECT  p.customer_id, CONCAT(first_name,last_name) AS name, COUNT(*) FROM payment p
INNER JOIN customer c ON p.customer_id = c.customer_id
GROUP BY name, p.customer_id
ORDER BY COUNT(*) DESC;

````