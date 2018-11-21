SELECT *
FROM employees
WHERE age > 36 AND salary > 50000 OR firstname = 'John' AND ismarried IS NOT FALSE;
SELECT *
FROM employees
WHERE age > 36 AND salary > 20000 AND salary < 40000;
SELECT *
FROM employees
WHERE age > 36 AND salary NOT BETWEEN 20000 AND 40000;
SELECT *
FROM employees
WHERE age NOT IN (26, 30, 24, 34);

INSERT INTO employees (firstname, lastname, age, salary, ismarried)
VALUES ('Tom', 'Tomson', ceil(random() * 50), ceil(random() * 100000), FALSE)

SELECT *FROM employees WHERE firstname LIKE '%m'
SELECT *FROM employees WHERE firstname LIKE '%m%'
SELECT *FROM employees WHERE firstname LIKE 'M%'
SELECT *FROM employees WHERE firstname LIKE 'M_%' ESCAPE 'k'

SELECT CURRENT_TIMESTAMP - 1

