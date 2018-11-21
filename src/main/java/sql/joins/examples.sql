INSERT INTO departments (name) VALUES ('DEV')
INSERT INTO departments (name) VALUES ('QA')
INSERT INTO departments (name) VALUES ('BA')
INSERT INTO departments (name) VALUES ('TL')


INSERT INTO employees_pk_fk (name, dept_id) VALUES ('John', 4);
INSERT INTO employees_pk_fk (name, dept_id) VALUES ('Anna', 4);
INSERT INTO employees_pk_fk (name, dept_id) VALUES ('Sara', 5);
INSERT INTO employees_pk_fk (name, dept_id) VALUES ('Jack', 5);
INSERT INTO employees_pk_fk (name, dept_id) VALUES ('Tim', 6);

INSERT INTO employees_pk_fk (name) VALUES ('Kate');

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  INNER JOIN departments
    ON employees_pk_fk.dept_id = departments.id
--   WHERE employees_pk_fk.name LIKE 'J%';

SELECT *
FROM employees_pk_fk
SELECT *
FROM departments

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  LEFT JOIN departments
    ON employees_pk_fk.dept_id = departments.id;

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  LEFT JOIN departments
    ON employees_pk_fk.dept_id = departments.id
WHERE employees_pk_fk.dept_id IS NULL

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  RIGHT JOIN departments
    ON employees_pk_fk.dept_id = departments.id

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  RIGHT JOIN departments
    ON employees_pk_fk.dept_id = departments.id
WHERE employees_pk_fk.dept_id IS NULL

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  FULL JOIN departments
    ON employees_pk_fk.dept_id = departments.id
WHERE employees_pk_fk.dept_id IS NULL

SELECT
  employees_pk_fk.name AS emp_name,
  departments.name     AS dept_name
FROM employees_pk_fk
  CROSS JOIN departments