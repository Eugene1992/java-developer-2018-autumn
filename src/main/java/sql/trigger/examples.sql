CREATE TABLE table_1 (
  name  VARCHAR(20),
  value NUMERIC
)

CREATE TABLE table_2 (
  name     VARCHAR(20),
  quantity NUMERIC
)

INSERT INTO table_1 (name, value) VALUES ('a', 1);
INSERT INTO table_1 (name, value) VALUES ('b', 1);
INSERT INTO table_1 (name, value) VALUES ('c', 1);
INSERT INTO table_1 (name, value) VALUES ('d', 1);

INSERT INTO table_2 (name, quantity) VALUES ('b', 2);
INSERT INTO table_2 (name, quantity) VALUES ('c', 2);
INSERT INTO table_2 (name, quantity) VALUES ('d', 2);
INSERT INTO table_2 (name, quantity) VALUES ('e', 2);

SELECT
  name,
  value
FROM table_1
WHERE table_1.name = 'a'
UNION ALL
SELECT
  name,
  quantity
FROM table_2
WHERE table_2.name = 'b' OR table_2.name = 'c'
ORDER BY name

TRUNCATE TABLE table_1
TRUNCATE TABLE table_2

CREATE TABLE human (
  id     NUMERIC PRIMARY KEY,
  age    NUMERIC,
  salary NUMERIC,
  name   VARCHAR(20)
)

INSERT INTO human (id, age, salary, name) VALUES (1, 69, 9689, 'Cassaundra');
INSERT INTO human (id, age, salary, name) VALUES (2, 71, 4550, 'Verene');
INSERT INTO human (id, age, salary, name) VALUES (3, 70, 5629, 'Israel');
INSERT INTO human (id, age, salary, name) VALUES (4, 32, 1426, 'Kip');
INSERT INTO human (id, age, salary, name) VALUES (5, 13, 4123, 'Raine');
INSERT INTO human (id, age, salary, name) VALUES (6, 66, 7592, 'Yehudi');
INSERT INTO human (id, age, salary, name) VALUES (7, 23, 4470, 'Yolanthe');
INSERT INTO human (id, age, salary, name) VALUES (8, 11, 7776, 'Gay');
INSERT INTO human (id, age, salary, name) VALUES (9, 31, 6584, 'Sheridan');
INSERT INTO human (id, age, salary, name) VALUES (10, 38, 2623, 'Carlin');
INSERT INTO human (id, age, salary, name) VALUES (11, 65, 1582, 'Oliver');
INSERT INTO human (id, age, salary, name) VALUES (12, 79, 2511, 'Etienne');
INSERT INTO human (id, age, salary, name) VALUES (13, 36, 6305, 'Kelvin');
INSERT INTO human (id, age, salary, name) VALUES (14, 20, 8144, 'Consolata');
INSERT INTO human (id, age, salary, name) VALUES (15, 20, 2857, 'Taddeo');
INSERT INTO human (id, age, salary, name) VALUES (16, 64, 1222, 'Danie');
INSERT INTO human (id, age, salary, name) VALUES (17, 62, 8318, 'Edik');
INSERT INTO human (id, age, salary, name) VALUES (18, 18, 3572, 'Kimbell');
INSERT INTO human (id, age, salary, name) VALUES (19, 20, 7872, 'Chauncey');
INSERT INTO human (id, age, salary, name) VALUES (20, 66, 7641, 'Lona');
INSERT INTO human (id, age, salary, name) VALUES (21, 77, 7462, 'Ruperta');
INSERT INTO human (id, age, salary, name) VALUES (22, 21, 3982, 'Maire');
INSERT INTO human (id, age, salary, name) VALUES (23, 35, 9702, 'Chiquia');
INSERT INTO human (id, age, salary, name) VALUES (24, 11, 3414, 'Bone');
INSERT INTO human (id, age, salary, name) VALUES (25, 54, 8767, 'Krishna');
INSERT INTO human (id, age, salary, name) VALUES (26, 32, 4024, 'Reidar');
INSERT INTO human (id, age, salary, name) VALUES (27, 48, 6646, 'Lilla');
INSERT INTO human (id, age, salary, name) VALUES (28, 18, 1037, 'Gunther');
INSERT INTO human (id, age, salary, name) VALUES (29, 21, 8509, 'Jocelin');
INSERT INTO human (id, age, salary, name) VALUES (30, 68, 9767, 'Laverna');
INSERT INTO human (id, age, salary, name) VALUES (31, 58, 3633, 'Maury');
INSERT INTO human (id, age, salary, name) VALUES (32, 10, 6974, 'Lemuel');
INSERT INTO human (id, age, salary, name) VALUES (33, 70, 9150, 'Flynn');
INSERT INTO human (id, age, salary, name) VALUES (34, 71, 9254, 'Clayson');
INSERT INTO human (id, age, salary, name) VALUES (35, 44, 1681, 'Alla');
INSERT INTO human (id, age, salary, name) VALUES (36, 14, 8231, 'My');
INSERT INTO human (id, age, salary, name) VALUES (37, 57, 2689, 'Silva');
INSERT INTO human (id, age, salary, name) VALUES (38, 20, 3752, 'Tobin');
INSERT INTO human (id, age, salary, name) VALUES (39, 65, 7932, 'Wilbert');
INSERT INTO human (id, age, salary, name) VALUES (40, 24, 3750, 'Agatha');
INSERT INTO human (id, age, salary, name) VALUES (41, 52, 5975, 'Garald');
INSERT INTO human (id, age, salary, name) VALUES (42, 26, 1460, 'Hayyim');
INSERT INTO human (id, age, salary, name) VALUES (43, 28, 3566, 'Yorgos');
INSERT INTO human (id, age, salary, name) VALUES (44, 27, 7296, 'Coral');
INSERT INTO human (id, age, salary, name) VALUES (45, 63, 9308, 'Sada');
INSERT INTO human (id, age, salary, name) VALUES (46, 19, 3225, 'Reuven');
INSERT INTO human (id, age, salary, name) VALUES (47, 12, 8397, 'Shaughn');
INSERT INTO human (id, age, salary, name) VALUES (48, 56, 6651, 'Dorothy');
INSERT INTO human (id, age, salary, name) VALUES (49, 64, 9840, 'Derwin');
INSERT INTO human (id, age, salary, name) VALUES (50, 51, 1700, 'Garv');
INSERT INTO human (id, age, salary, name) VALUES (51, 62, 9100, 'Lilia');
INSERT INTO human (id, age, salary, name) VALUES (52, 16, 4733, 'Alix');
INSERT INTO human (id, age, salary, name) VALUES (53, 18, 4029, 'Haskel');
INSERT INTO human (id, age, salary, name) VALUES (54, 11, 9357, 'Ulises');
INSERT INTO human (id, age, salary, name) VALUES (55, 31, 7781, 'Bonnee');
INSERT INTO human (id, age, salary, name) VALUES (56, 55, 9244, 'Nels');
INSERT INTO human (id, age, salary, name) VALUES (57, 47, 7300, 'Josee');
INSERT INTO human (id, age, salary, name) VALUES (58, 74, 6093, 'Falito');
INSERT INTO human (id, age, salary, name) VALUES (59, 31, 4810, 'Anetta');
INSERT INTO human (id, age, salary, name) VALUES (60, 22, 5678, 'Ronda');
INSERT INTO human (id, age, salary, name) VALUES (61, 31, 5546, 'Camile');
INSERT INTO human (id, age, salary, name) VALUES (62, 22, 2161, 'Bryanty');
INSERT INTO human (id, age, salary, name) VALUES (63, 16, 3344, 'Garrot');
INSERT INTO human (id, age, salary, name) VALUES (64, 21, 3724, 'Barnard');
INSERT INTO human (id, age, salary, name) VALUES (65, 66, 7466, 'Camellia');
INSERT INTO human (id, age, salary, name) VALUES (66, 60, 6546, 'Eda');
INSERT INTO human (id, age, salary, name) VALUES (67, 73, 8213, 'Valle');
INSERT INTO human (id, age, salary, name) VALUES (68, 20, 3533, 'Rozamond');
INSERT INTO human (id, age, salary, name) VALUES (69, 50, 9903, 'Aldus');
INSERT INTO human (id, age, salary, name) VALUES (70, 31, 9527, 'Sammy');
INSERT INTO human (id, age, salary, name) VALUES (71, 77, 5613, 'Adrianna');
INSERT INTO human (id, age, salary, name) VALUES (72, 33, 2528, 'Nicoli');
INSERT INTO human (id, age, salary, name) VALUES (73, 26, 3446, 'Dari');
INSERT INTO human (id, age, salary, name) VALUES (74, 47, 4332, 'Kittie');
INSERT INTO human (id, age, salary, name) VALUES (75, 66, 9901, 'Abeu');
INSERT INTO human (id, age, salary, name) VALUES (76, 13, 8598, 'Cassius');
INSERT INTO human (id, age, salary, name) VALUES (77, 57, 9076, 'Shalna');
INSERT INTO human (id, age, salary, name) VALUES (78, 67, 2498, 'Leigh');
INSERT INTO human (id, age, salary, name) VALUES (79, 44, 4065, 'Abeu');
INSERT INTO human (id, age, salary, name) VALUES (80, 61, 4357, 'Tomasina');
INSERT INTO human (id, age, salary, name) VALUES (81, 46, 3624, 'Mada');
INSERT INTO human (id, age, salary, name) VALUES (82, 59, 4537, 'Quinn');
INSERT INTO human (id, age, salary, name) VALUES (83, 76, 8046, 'Greta');
INSERT INTO human (id, age, salary, name) VALUES (84, 27, 3754, 'Rosalinda');
INSERT INTO human (id, age, salary, name) VALUES (85, 40, 1028, 'Care');
INSERT INTO human (id, age, salary, name) VALUES (86, 30, 5484, 'Derrek');
INSERT INTO human (id, age, salary, name) VALUES (87, 37, 6392, 'Peggy');
INSERT INTO human (id, age, salary, name) VALUES (88, 12, 2693, 'Vilhelmina');
INSERT INTO human (id, age, salary, name) VALUES (89, 71, 5732, 'Bordie');
INSERT INTO human (id, age, salary, name) VALUES (90, 13, 7756, 'Lauren');
INSERT INTO human (id, age, salary, name) VALUES (91, 44, 3872, 'Marcella');
INSERT INTO human (id, age, salary, name) VALUES (92, 25, 7202, 'Imogen');
INSERT INTO human (id, age, salary, name) VALUES (93, 64, 3975, 'Angelica');
INSERT INTO human (id, age, salary, name) VALUES (94, 22, 2052, 'Aldon');
INSERT INTO human (id, age, salary, name) VALUES (95, 42, 1446, 'Eartha');
INSERT INTO human (id, age, salary, name) VALUES (96, 38, 5274, 'Leonie');
INSERT INTO human (id, age, salary, name) VALUES (97, 20, 6664, 'Gabriele');
INSERT INTO human (id, age, salary, name) VALUES (98, 50, 8031, 'Scottie');
INSERT INTO human (id, age, salary, name) VALUES (99, 19, 6753, 'Joline');
INSERT INTO human (id, age, salary, name) VALUES (100, 34, 8652, 'Ethelind');


SELECT *
FROM human
WHERE salary > 9500
ORDER BY salary ASC
LIMIT 3
SELECT *
FROM human
WHERE salary > 9500
ORDER BY salary
SELECT *
FROM human
WHERE salary > 9500
ORDER BY salary ASC
LIMIT 3
OFFSET 0 * 3
SELECT *
FROM human
WHERE salary > 9500
ORDER BY salary ASC
LIMIT 3
OFFSET 1 * 3
SELECT *
FROM human
WHERE salary > 9500
ORDER BY salary ASC
LIMIT 3
OFFSET 2 * 3

SELECT *
FROM human
ORDER BY salary DESC
LIMIT 3

DROP TABLE human_copy_1
SELECT *
INTO human_copy_1
FROM human

SELECT *
INTO human_copy_2
FROM human
WHERE salary > 9500

SELECT *
FROM human_copy_1

SELECT *
FROM human_copy_2

SELECT *
FROM human_copy_4

SELECT * INTO human_copy_4
FROM human
WHERE 1 = 1

INSERT INTO human (id, age, salary, name) VALUES (101, 25, 10000, 'Tom');DROP DATABASE human;

SELECT * INTO human_copy_7
FROM human
WHERE FALSE

SELECT *
FROM human_copy_7;

INSERT INTO human_copy_7 (id, name)
  SELECT id, name FROM human;

TRUNCATE TABLE human_copy_7;


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
