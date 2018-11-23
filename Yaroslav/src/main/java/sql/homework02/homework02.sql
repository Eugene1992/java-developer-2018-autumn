CREATE TABLE users(
  id SERIAL PRIMARY KEY ,
  userName VARCHAR(30),
  firstName VARCHAR(30),
  lastName VARCHAR(30),
  isEmailVerified BOOLEAN);



CREATE TABLE products(
  id SERIAL PRIMARY KEY ,
  name VARCHAR(30),
  price FLOAT,
  discount FLOAT
);


CREATE TABLE shoppingcarts(
  cartId INTEGER PRIMARY KEY ,
  userId INTEGER,
  FOREIGN KEY (userId) REFERENCES users
);


CREATE TABLE products_cart (
  recordId SERIAL,
  cartId     INTEGER,
  product_id INTEGER,
  amount     INTEGER,
  FOREIGN KEY (cartId) REFERENCES shoppingcarts,
  FOREIGN KEY (product_id) REFERENCES products
);


INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('Анд', 'Андрей',	'Адреев', TRUE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('Макпет', 'Максим',	'Петров', TRUE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('ОксанК', 'Оксана',	'Ковальова', FALSE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('Слава', 'Святослав',	'Максимов', TRUE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('Валери', 'Валерия',	'Егорова', FALSE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('ПП', 'Петр',	'Петренко', FALSE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('ЕгорА', 'Егор',	'Антонов', TRUE );
INSERT INTO users(userName, firstName, lastName, isEmailVerified) VALUES ('Лена', 'Елена',	'Васильева', TRUE );




INSERT INTO products(name, price, discount) VALUES ('Хлеб', 5.0,	20.0);
INSERT INTO products(name, price, discount) VALUES ('Пиво', 15.0,	30.0);
INSERT INTO products(name, price, discount) VALUES ('Водка', 25.0,	40.0);
INSERT INTO products(name, price, discount) VALUES ('Молоко', 13.0,	10.0);
INSERT INTO products(name, price, discount) VALUES ('Кефир', 9.5,	20.0);
INSERT INTO products(name, price, discount) VALUES ('Яблочный сок', 18.0,	11.7);
INSERT INTO products(name, price, discount) VALUES ('Квас', 5.0,	14.3);
INSERT INTO products(name, price, discount) VALUES ('Живчик', 5.0,	22.2);


INSERT INTO shoppingcarts(cartId, userId) VALUES (121,1);
INSERT INTO shoppingcarts(cartId, userId) VALUES (132,2);
INSERT INTO shoppingcarts(cartId, userId) VALUES (233,3);
INSERT INTO shoppingcarts(cartId, userId) VALUES (442,4);
INSERT INTO shoppingcarts(cartId, userId) VALUES (245,5);
INSERT INTO shoppingcarts(cartId, userId) VALUES (446,6);
INSERT INTO shoppingcarts(cartId, userId) VALUES (227,7);
INSERT INTO shoppingcarts(cartId, userId) VALUES (878,8);



INSERT INTO products_cart(cartId, product_id, amount) VALUES (121, 1, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (121, 2, 12);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (132, 3, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (132, 4, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (233, 5, 14);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (233, 6, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (442, 7, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (442, 8, 15);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (245, 3, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (446, 4, 10);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (446, 5, 16);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (227, 1, 11);
INSERT INTO products_cart(cartId, product_id, amount) VALUES (227, 2, 19);






