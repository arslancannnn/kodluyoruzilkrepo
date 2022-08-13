# 1. SORU

````SQL

(SELECT first_name FROM actor)
UNION
(SELECT first_name FROM customer);

`````

# 2. SORU

````SQL

(SELECT first_name FROM actor)
INTERSECT
(SELECT first_name FROM customer);

````

# 3. SORU

````SQL

(SELECT first_name FROM actor)
EXCEPT
(SELECT first_name FROM customer);

````

# 4. SORU

## UNION ALL

````SQL

(SELECT first_name FROM actor)
UNION ALL
(SELECT first_name FROM customer);

````

## INTERSECT ALL

````SQL

(SELECT first_name FROM actor)
INTERSECT ALL
(SELECT first_name FROM customer);

````

## EXCEPT ALL

````SQL

(SELECT first_name FROM actor)
EXCEPT ALL
(SELECT first_name FROM customer);

````