CREATE TABLE user_details (
id SERIAL PRIMARY KEY,
phone VARCHAR (13),
email VARCHAR (50),
age INT,
gender VARCHAR (6)
);

CREATE TABLE address(
id SERIAL PRIMARY KEY,
city VARCHAR (40),
country VARCHAR (30),
post_code VARCHAR (20)
);

CREATE TABLE "user" (
id SERIAL PRIMARY KEY,
first_name VARCHAR (25),
last_name VARCHAR (50),
username VARCHAR (20),
password VARCHAR (10),
role VARCHAR (20),
user_details INT UNIQUE REFERENCES user_details(id),
address INT REFERENCES address(id)
);

CREATE TABLE category(
id SERIAL PRIMARY KEY,
name VARCHAR (30),
description VARCHAR (100),
sub_category INT REFERENCES category(id)
);

CREATE TABLE product(
id SERIAL PRIMARY KEY,
name VARCHAR (50),
description VARCHAR (100),
price NUMERIC ,
quantity INT,
active BOOLEAN,
category INT REFERENCES category(id)
);

CREATE TYPE tag AS ENUM ('Покупка','Возврат','Отмена');

CREATE TABLE comment (
id SERIAL PRIMARY KEY,
title VARCHAR (50),
text VARCHAR (300),
is_deleted BOOLEAN
);

CREATE TABLE "order" (
id SERIAL PRIMARY KEY,
serial_number INT,
order_status VARCHAR (20),
tag tag,
order_user_id INT UNIQUE REFERENCES "user"(id),
comment_id INT REFERENCES comment(id)
);

CREATE TABLE order_products(
id SERIAL PRIMARY KEY,
product_id INT REFERENCES product(id),
order_id INT REFERENCES "order"(id)
);




