-- 1) Создать таблицу contact
-- 2) Удалить таблицу contact
-- 3) Пересоздать таблицу contact с атрибутами
-- - first_name(VARCHAR, NON_NULL),
-- - last_name(TEXT),
-- - birthday(DATE),
-- - phone(INT),
-- - city(VARCHAR),
-- - country(VARCHAR)
-- 4) Изменить тип атрибута last_name с TEXT на VARCHAR
-- 5) Добавить ограничение NON_NULL в атрибут last_name
-- 6) Заполнить таблицу contact 20 записями(женские имена должны заканчиваться на букву 'а')
-- 7) Добавить в таблицу contact атрибут gender(VARCHAR)
-- 8) Изменить таблицу contact, заполнив атрибут gender значениями male/female по условию - если first_name заканчивается на букву 'а' - female, все другие - male
-- 9) Добавить атрибут rating (INT) с ограничением на только положительные значения

CREATE TABLE contact()
DROP TABLE contact

CREATE TABLE contact(
id SERIAL,
first_name VARCHAR(30) NOT NULL,
last_name TEXT,
birthday DATE,
phone INT,
city VARCHAR(50),
country VARCHAR(50)
);

ALTER TABLE "contact" ALTER COLUMN "last_name"
SET DATA TYPE VARCHAR(50);

ALTER TABLE "contact" ALTER COLUMN "last_name"
 SET NOT NULL;

INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (1, 'Maella', 'Cymper', '1993-04-06', '2127786', 'Korniyivka', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (2, 'Giselda', 'Tesche', '1990-10-24', '9246900', 'Savyntsi', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (3, 'Irena', 'Oddboy', '1983-12-06', '9443789', 'Velykyy Burluk', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (4, 'Magdalena', 'Attrey', '1980-07-30', '4968194', 'Wodzierady', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (5, 'Eduard', 'Tichelaar', '1983-07-11', '8506276', 'Mýto', 'Czech Republic');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (6, 'Adela', 'Wolseley', '1989-02-25', '9122385', 'Vashkivtsi', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (7, 'Goran', 'Grosier', '1979-11-08', '2794927', 'Tomice', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (8, 'Celestina', 'Duxfield', '1976-04-07', '5198216', 'Chlumčany', 'Czech Republic');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (9, 'Marylena', 'Baildon', '1979-07-13', '9250395', 'Pershotravneve', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (10, 'Pelagiya', 'Maltby', '1987-03-25', '5163136', 'Vrbice', 'Czech Republic');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (11, 'Irena', 'Yuryaev', '1985-10-25', '8464705', 'Ozorków', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (12, 'Laurena', 'Krink', '1988-01-14', '8133815', 'Stoczek', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (13, 'Mariya', 'Crofthwaite', '1999-06-07', '7365995', 'Velyki Mezhyrichi', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (14, 'Leonora', 'Thunderchief', '1992-08-17', '7487914', 'Kokotów', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (15, 'Elvira', 'Twelvetree', '1989-02-13', '3367248', 'Pustomyty', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (16, 'Andrey', 'Kildea', '1993-10-30', '6540484', 'Vilémov', 'Czech Republic');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (17, 'Cheslav', 'Itscowicz', '1977-01-03', '1078890', 'Podebłocie', 'Poland');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (18, 'Lukas', 'Talbot', '1978-01-16', '4251509', 'Žeravice', 'Czech Republic');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (19, 'Regina', 'Ludford', '1987-12-02', '6260474', 'Korsun’-Shevchenkivs’kyy', 'Ukraine');
INSERT INTO contact (id, first_name, last_name, birthday, phone, city, country) VALUES (20, 'Gonzo', 'Caws', '1989-03-11', '7203196', 'Podolí', 'Czech Republic');

ALTER TABLE contact ADD COLUMN gender VARCHAR (6)

UPDATE contact
SET gender = 'female' WHERE RIGHT(first_name,1) = 'a';

UPDATE contact
SET gender = 'male' WHERE NOT RIGHT(first_name,1) = 'a';

ALTER TABLE contact ADD COLUMN rating INT CHECK (rating > 0);

ALTER TABLE contact DROP CONSTRAINT contact_rating_check;

ALTER TABLE contact ADD CHECK (rating >= 0);

UPDATE contact SET rating = 0
