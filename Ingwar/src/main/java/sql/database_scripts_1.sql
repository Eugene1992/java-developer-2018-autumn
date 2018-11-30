CREATE TABLE employees (
  id SERIAL,
  firstName VARCHAR(50),
  lastName VARCHAR(50),
  age NUMERIC,
  salary NUMERIC
);

  INSERT INTO employees(firstName, lastName, age, salary) VALUES ('Bill','Packston',36,16000);

SELECT * FROM employees;

ALTER TABLE employees
ADD COLUMN isMarried BOOLEAN DEFAULT FALSE;

ALTER TABLE employees
    ALTER COLUMN isMarried
    SET NOT NULL;

UPDATE employees
SET isMarried = FALSE;

UPDATE employees
SET isMarried = TRUE
WHERE age > 27;

CREATE TABLE products(
id SERIAL PRIMARY KEY ,
name VARCHAR(50),
price NUMERIC ,
discount NUMERIC
);

CREATE TABLE shopping_carts (
id SERIAL PRIMARY KEY,
cardNumber NUMERIC,
product_id INTEGER,
FOREIGN KEY (product_id)  REFERENCES products
);

CREATE TABLE users (
id SERIAL PRIMARY KEY,
firstName VARCHAR(50),
lastName VARCHAR(50),
isEmailVerified BOOLEAN,
cart_id INTEGER,
FOREIGN KEY (cart_id) REFERENCES shopping_carts
);

INSERT INTO products ("name", price, discount) VALUES ('Milk',30,5);
INSERT INTO products ("name", price, discount) VALUES ('Beer',44,3);
INSERT INTO products ("name", price, discount) VALUES ('Bread',17,0);
INSERT INTO products ("name", price, discount) VALUES ('Vodka',78,10);
INSERT INTO products ("name", price, discount) VALUES ('Fish',155,7);
INSERT INTO products ("name", price, discount) VALUES ('Mead',67,1);
INSERT INTO products ("name", price, discount) VALUES ('Pork',97,0);

INSERT INTO shopping_carts VALUES (1,123,1);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (2,456,2);
INSERT INTO shopping_carts (id, cardNumber) VALUES (3,789);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (4,901,1);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (5,234,4);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (6,345,5);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (7,456,6);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (8,567,7);
INSERT INTO shopping_carts (id, cardNumber,product_id) VALUES (9,678,3);

INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (1, 'Fey', 'Swires', false, 3);
INSERT INTO users (id, firstName, lastName, isEmailVerified) VALUES (2, 'Rae', 'Cordall', false);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (3, 'Megen', 'Droghan', true, 1);
INSERT INTO users (id, firstName, lastName, isEmailVerified) VALUES (4, 'Perl', 'Rintoul', false);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (5, 'Buddie', 'Jamot', true, 1);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (6, 'Nadean', 'Lewins', false, 5);
INSERT INTO users (id, firstName, lastName, isEmailVerified) VALUES (7, 'Berta', 'Garbar', false);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (8, 'Paulina', 'Stetson', false, 1);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (9, 'Helaina', 'Lexa', true, 6);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (10, 'Glen', 'Von Der Empten', true, 1);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (11, 'Ludovico', 'Antonov', true, 2);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (12, 'Cristal', 'Chotty', false, 8);
INSERT INTO users (id, firstName, lastName, isEmailVerified) VALUES (13, 'Kerry', 'Hurrion', true);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (14, 'Dunstan', 'Beste', false, 1);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (15, 'Idalia', 'Faldo', true, 3);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (16, 'Jelene', 'Managh', false, 7);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (17, 'Elinore', 'Ribey', true, 4);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (18, 'Gare', 'Ebbetts', true, 9);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (19, 'Shana', 'Vasilyevski', true, 3);
INSERT INTO users (id, firstName, lastName, isEmailVerified, cart_id) VALUES (20, 'Bria', 'Vautin', false, 1);

SELECT lastName FROM users
WHERE cart_id IS NOT NULL

SELECT lastName,
sc.cardNumber,
p.name,
p.price
FROM users
LEFT JOIN shopping_carts sc on users.cart_id = sc.id
LEFT JOIN products p on sc.product_id = p.id
WHERE p.name = 'Milk' OR p.name = 'Beer' OR p.name = 'Bread' OR p.name = 'Vodka';

-- add for trigger
CREATE OR REPLACE FUNCTION check_salary()
  RETURNS TRIGGER AS $$
BEGIN
  IF OLD.salary > NEW.salary
  THEN
    RAISE EXCEPTION 'Dont poore this one!';
  END IF;
  RETURN NEW;
END;
$$ LANGUAGE plpgsql

CREATE TRIGGER human_check_salary BEFORE UPDATE OR INSERT ON "human" FOR EACH ROW EXECUTE PROCEDURE check_salary();

DROP TRIGGER human_check_salary ON human;

UPDATE human SET salary = 1000 WHERE id = 2

INSERT INTO human (id, age, salary, name) VALUES (102, 43, 12121, 'Sara');
--


