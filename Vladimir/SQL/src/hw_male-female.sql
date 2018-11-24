CREATE TABLE "contact" (

);

DROP TABLE "contact";

CREATE TABLE "contact" (
  first_name VARCHAR NOT NULL,
  last_name  TEXT,
  birthday   DATE,
  phone      INT,
  city       VARCHAR,
  country    VARCHAR
);

ALTER TABLE "contact"
ALTER COLUMN last_name
    SET DATA TYPE VARCHAR;

ALTER TABLE "contact"
  ALTER COLUMN last_name
  SET NOT NULL;

INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Cross', 'Gossart', '1/27/2013', '1962117', 'Mudian', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Ole', 'Golthorpp', '6/20/1957', '1960498', 'Huangwei', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Lydie', 'Goadsby', '12/7/1990', '1634492', 'Quezaltepeque', 'El Salvador');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Tedra', 'McRorie', '1/23/1966', '2696857', 'Atamanovka', 'Russia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Kakalina', 'Geany', '5/6/1931', '1542426', 'Malibong East', 'Philippines');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Vaughan', 'Nurden', '6/11/1962', '5527583', 'Idhnā', 'Palestinian Territory');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Rosalinda', 'Morales', '11/27/1958', '3418394', 'Halayhayin', 'Philippines');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Caty', 'Warhurst', '4/10/1955', '5087012', 'Changxingbao', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Forester', 'Mongenot', '7/31/1948', '4506270', 'Cachón', 'Dominican Republic');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Linus', 'McGilvra', '7/3/1942', '5820708', 'Sobradinho', 'Brazil');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Catha', 'Jerome', '9/8/1937', '8120839', 'Tver', 'Russia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Bastien', 'Jambrozek', '12/24/1928', '4539711', 'Nancheng', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Dyanna', 'Taaffe', '12/9/1929', '7791115', 'Zhanqian', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Balduin', 'De''Ath', '9/19/1934', '2325137', 'Dampit', 'Indonesia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Wat', 'Boyer', '11/25/1939', '1578804', 'Hněvotín', 'Czech Republic');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Missie', 'Mowsley', '1/17/1962', '7609360', 'Velikiy Novgorod', 'Russia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Haily', 'Rowcastle', '6/16/1902', '5420351', 'Palocabildo', 'Colombia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Napoleon', 'Santora', '10/8/1990', '1110062', 'Solntsevo', 'Russia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Eolanda', 'Loudiane', '12/26/2001', '5115246', 'Podujeva', 'Kosovo');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Sancho', 'Eplett', '6/18/1990', '6674634', 'Butel', 'Macedonia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Tadeo', 'Ollcott', '7/10/1941', '6181381', 'Thị Trấn Hát Lót', 'Vietnam');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Wylma', 'Caras', '3/8/1944', '5219572', 'Uzlovaya', 'Russia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Barbey', 'Nye', '10/13/1978', '2010938', 'Zapod', 'Albania');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Erna', 'Leed', '12/19/1981', '2377120', 'Mengjia', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Filia', 'Hobble', '3/26/1960', '3937691', 'Caldas Novas', 'Brazil');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Malcolm', 'Mannakee', '3/13/1948', '5481329', 'Raciążek', 'Poland');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Prentiss', 'Attwoul', '7/25/1903', '6256670', 'Aguachica', 'Colombia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Frank', 'Tombs', '10/6/1902', '4854355', 'Yunfu', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Cornela', 'Rhule', '10/21/1970', '5979788', 'Harding', 'South Africa');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Debora', 'Hardy', '1/7/1989', '9767723', 'Krojo', 'Indonesia');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Sissy', 'Pettisall', '7/18/1968', '7722686', 'Sacapulas', 'Guatemala');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Sallyanne', 'Paske', '12/24/1987', '7324585', 'Gengqing', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Birdie', 'Quinnelly', '11/6/1989', '1235526', 'Pembroke', 'Canada');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Dee', 'Popham', '4/1/1914', '8432724', 'Cicheng', 'China');
INSERT INTO contact (first_name, last_name, birthday, phone, city, country) values ('Clare', 'Gosnay', '7/9/1968', '7255864', 'Loja', 'Ecuador');

ALTER TABLE contact
    ADD COLUMN gender VARCHAR(50);

UPDATE contact
  SET gender = 'female' WHERE first_name LIKE '%a';

UPDATE contact
  SET gender = 'male' WHERE first_name NOT LIKE '%a';

ALTER TABLE contact
    ADD COLUMN rating INT CHECK(rating > 0);