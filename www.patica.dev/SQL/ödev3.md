## 1. Soru

````SQL

SELECT country FROM country WHERE country LIKE 'A%a';

````

## 2. Soru

````SQL

SELECT country FROM country WHERE country LIKE '_____%n';

````

## 3. Soru

````SQL

SELECT title FROM film WHERE title ILIKE '%t%t%t%t';

````

## 4. Soru 

````SQL

SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate IN (2.99);

````
