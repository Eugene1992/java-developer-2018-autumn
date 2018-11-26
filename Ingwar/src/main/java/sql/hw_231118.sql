DROP TABLE employees;

CREATE TABLE customer(
id INT PRIMARY KEY,
name VARCHAR (20),
country VARCHAR (20)
)

CREATE TABLE employee (
id INT PRIMARY KEY,
first_name VARCHAR (20),
last_name VARCHAR (40),
age INT,
email VARCHAR (40),
gender VARCHAR (6),
salary NUMERIC,
customer_id INT,
FOREIGN KEY (customer_id) references customer
);

insert into customer (id, name, country) values (1, 'Rolex', 'Switzerland');
insert into customer (id, name, country) values (2, 'Lego', 'Denmark');
insert into customer (id, name, country) values (3, 'Google', 'USA');
insert into customer (id, name, country) values (4, 'Canon', 'Japan');
insert into customer (id, name, country) values (5, 'Bosch', 'Germany');
insert into customer (id, name, country) values (6, 'Sony', 'Japan');
insert into customer (id, name, country) values (7, 'Intel', 'USA');
insert into customer (id, name, country) values (8, 'Rolls-Royce', 'UK');
insert into customer (id, name, country) values (9, 'Adidas', 'Germany');
insert into customer (id, name, country) values (10, 'Christian Dior', 'France');

insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (1, 'Kendal', 'O''Murtagh', 62, 'komurtagh0@walmart.com', 'Male', 18338, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (2, 'Bonny', 'Plessing', 60, 'bplessing1@reddit.com', 'Female', 77194, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (3, 'Jordon', 'Dilgarno', 34, 'jdilgarno2@kickstarter.com', 'Male', 96680, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (4, 'Samantha', 'Alldread', 38, 'salldread3@dailymotion.com', 'Female', 61294, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (5, 'Tillie', 'Weddup', 68, 'tweddup4@blinklist.com', 'Female', 35704, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (6, 'Tyrone', 'Oldfield', 76, 'toldfield5@stumbleupon.com', 'Male', 28021, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (7, 'Bondie', 'Quiney', 42, 'bquiney6@ezinearticles.com', 'Male', 92640, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (8, 'Evvy', 'Peterson', 50, 'epeterson7@sbwire.com', 'Female', 15700, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (9, 'Norris', 'Hurran', 19, 'nhurran8@amazonaws.com', 'Male', 10790, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (10, 'Salim', 'Alker', 60, 'salker9@sciencedirect.com', 'Male', 66950, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (11, 'Cherice', 'Boor', 42, 'cboora@examiner.com', 'Female', 5250, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (12, 'Lavinie', 'Dear', 43, 'ldearb@jugem.jp', 'Female', 21772, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (13, 'Sanders', 'Hampshire', 19, 'shampshirec@imgur.com', 'Male', 14386, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (14, 'Riva', 'Fairebrother', 46, 'rfairebrotherd@1und1.de', 'Female', 93853, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (15, 'Cristian', 'Dredge', 31, 'cdredgee@google.co.jp', 'Male', 47961, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (16, 'Lisette', 'Hinge', 49, 'lhingef@mapy.cz', 'Female', 53020, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (17, 'Kevan', 'Frantzeni', 30, 'kfrantzenig@skype.com', 'Male', 23356, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (18, 'Giffie', 'Wason', 38, 'gwasonh@blogger.com', 'Male', 31833, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (19, 'Yves', 'Lagne', 30, 'ylagnei@bluehost.com', 'Male', 64984, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (20, 'Fabio', 'McKeevers', 66, 'fmckeeversj@photobucket.com', 'Male', 89484, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (21, 'Whit', 'Huller', 50, 'whullerk@twitpic.com', 'Male', 58066, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (22, 'Bridgette', 'Watsham', 80, 'bwatshaml@uiuc.edu', 'Female', 40596, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (23, 'Biron', 'Hurry', 38, 'bhurrym@home.pl', 'Male', 42342, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (24, 'Berny', 'Fintoph', 67, 'bfintophn@disqus.com', 'Female', 28987, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (25, 'Nikaniki', 'Starzaker', 27, 'nstarzakero@comcast.net', 'Female', 61094, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (26, 'Saundra', 'Benfell', 55, 'sbenfellp@mac.com', 'Male', 11354, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (27, 'Carney', 'O''Corren', 30, 'cocorrenq@wiley.com', 'Male', 88079, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (28, 'Petey', 'Caselick', 70, 'pcaselickr@dedecms.com', 'Male', 91860, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (29, 'Carolina', 'Sutterby', 47, 'csutterbys@house.gov', 'Female', 7635, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (30, 'Taddeusz', 'Dalzell', 76, 'tdalzellt@posterous.com', 'Male', 28601, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (31, 'Gwenneth', 'Gregoraci', 34, 'ggregoraciu@mit.edu', 'Female', 5214, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (32, 'Debbi', 'Montague', 57, 'dmontaguev@sitemeter.com', 'Female', 96055, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (33, 'Ab', 'Urion', 26, 'aurionw@tmall.com', 'Male', 31674, 5);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (34, 'Zsazsa', 'Flew', 26, 'zflewx@sourceforge.net', 'Female', 46127, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (35, 'Ayn', 'Applegarth', 52, 'aapplegarthy@tumblr.com', 'Female', 47148, 9);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (36, 'Reagen', 'Pampling', 77, 'rpamplingz@cyberchimps.com', 'Male', 48410, 6);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (37, 'Cleopatra', 'Greyes', 63, 'cgreyes10@nifty.com', 'Female', 58597, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (38, 'Valaria', 'Mabbe', 19, 'vmabbe11@who.int', 'Female', 64959, 7);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (39, 'Vanessa', 'Clorley', 19, 'vclorley12@networkadvertising.org', 'Female', 58751, 10);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (40, 'Benedicta', 'Brooks', 76, 'bbrooks13@goo.ne.jp', 'Female', 7508, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (41, 'Cymbre', 'Nelligan', 39, 'cnelligan14@senate.gov', 'Female', 89920, 10);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (42, 'Vittorio', 'Delicate', 24, 'vdelicate15@behance.net', 'Male', 2494, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (43, 'Roscoe', 'Trower', 44, 'rtrower16@biglobe.ne.jp', 'Male', 25211, 2);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (44, 'Prisca', 'Paley', 35, 'ppaley17@unblog.fr', 'Female', 82522, 3);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (45, 'Jerrilee', 'Bealton', 49, 'jbealton18@ycombinator.com', 'Female', 24163, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (46, 'Chad', 'Tuny', 36, 'ctuny19@51.la', 'Male', 78601, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (47, 'Cloe', 'Giannasi', 66, 'cgiannasi1a@naver.com', 'Female', 31719, 1);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (48, 'Cassius', 'Margaret', 69, 'cmargaret1b@globo.com', 'Male', 84209, 8);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (49, 'Chiquita', 'Wrench', 58, 'cwrench1c@vistaprint.com', 'Female', 97332, 4);
insert into employee (id, first_name, last_name, age, email, gender, salary, customer_id)
values (50, 'Cord', 'Comiskey', 58, 'ccomiskey1d@yellowbook.com', 'Male', 94092, 1);

SELECT first_name,last_name,salary FROM employee
WHERE salary < (SELECT AVG (salary) FROM employee INNER JOIN customer c2 on employee.customer_id = c2.id
WHERE c2.name = 'Google')ORDER by salary DESC;

SELECT first_name,last_name,salary FROM employee
INNER JOIN customer c3 on employee.customer_id = c3.id
WHERE c3.country = 'Switzerland' AND salary > (SELECT MAX (salary) FROM employee INNER JOIN customer c2 on employee.customer_id = c2.id
WHERE c2.name = 'Bosch')
ORDER by salary ASC;

UPDATE employee SET salary = salary + (salary/4)
WHERE gender = 'Female' AND salary BETWEEN (SELECT AVG(salary) FROM employee WHERE gender = 'Male') AND 100000;

DELETE FROM employee WHERE id IN (SELECT id FROM employee WHERE age > 60);

INSERT INTO employee (id,first_name, last_name, age, email, gender, salary, customer_id)
VALUES (51,'Hans','Holt',35,'hholt@gmail.com','Male',(SELECT AVG (salary) FROM employee
INNER JOIN customer c2 on employee.customer_id = c2.id WHERE c2.name = 'Google'),(SELECT id FROM customer WHERE name = 'Google'));

DROP TABLE customer CASCADE;
DROP TABLE employee;

-- HW

create table employee (
  employee_id   int primary key,
  name          varchar(20),
  job           varchar(20),
  manager_id    int,
  hiredate      date,
  salary        int,
  cpmmissions   int,
  department_id varchar(20)
);

create table department (
  department_id int primary key,
  name          varchar(20),
  location      varchar(20)
);
INSERT INTO department VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO department VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO department VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO department VALUES (40, 'OPERATIONS', 'BOSTON');

INSERT INTO employee VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);
INSERT INTO employee VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);
INSERT INTO employee VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);
INSERT INTO employee VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('2-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);
INSERT INTO employee VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);
INSERT INTO employee VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);
INSERT INTO employee VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('9-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);
INSERT INTO employee VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);
INSERT INTO employee VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('8-09-1981', 'DD-MM-YYYY'), 1500, 0, 30);
INSERT INTO employee VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);
INSERT INTO employee VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);
INSERT INTO employee VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('3-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);
INSERT INTO employee VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);

ALTER TABLE employee
  ADD CONSTRAINT employee FOREIGN KEY (manager_id) REFERENCES employee (employee_id);

SELECT name, salary FROM employee WHERE salary > 2850;

SELECT name, department_id FROM employee WHERE employee_id = 7566;

SELECT name, salary FROM employee WHERE salary NOT BETWEEN 1500 AND 2850;

SELECT name, job, hiredate FROM employee WHERE hiredate BETWEEN TO_DATE('20-02-1981', 'DD-MM-YYYY')
AND TO_DATE('1-05-1981', 'DD-MM-YYYY') ORDER BY hiredate ASC;

SELECT name, department_id FROM employee WHERE department_id IN('10','30') ORDER BY name ASC;

SELECT name AS "Employee",salary AS "Monthly Salary" FROM employee WHERE salary > 1500 AND department_id IN('10','30');

SELECT  name, hiredate FROM employee WHERE date_part('year',hiredate) = '1982';

SELECT name, job FROM employee WHERE manager_id IS NULL;

SELECT name, salary, cpmmissions FROM employee WHERE cpmmissions IS NOT NULL
ORDER BY salary DESC , cpmmissions DESC ;

SELECT name FROM employee WHERE name LIKE '__A%';

SELECT name FROM employee WHERE name LIKE '%LL%'

SELECT name, job, salary FROM employee WHERE job IN ('CLERK', 'ANALYST') AND salary NOT IN (1000,3000,5000);

SELECT name, salary, cpmmissions FROM employee WHERE cpmmissions > salary + (salary/10);





