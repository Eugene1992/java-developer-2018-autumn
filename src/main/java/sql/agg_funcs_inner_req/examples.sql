SELECT *
FROM employee;


SELECT sum(salary) / 12 AS "salary_per_month"
FROM employee;

SELECT round(avg(salary))
FROM employee;

SELECT min(salary)
FROM employee
SELECT max(salary)
FROM employee

SELECT
  count(first_name),
  sum(salary)
FROM employee
WHERE gender = 'Female';

SELECT *
FROM employee
WHERE gender = 'Female' AND salary > (SELECT max(salary)
                                      FROM employee
                                      WHERE gender = 'Male')


SELECT *
FROM employee
WHERE gender = 'Female'  ORDER BY first_name ASC, last_name ASC

-- AVG()
-- MIN()
-- MAX()
-- SUM()
-- COUNT()