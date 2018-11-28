/*Перечисление гендер*/
CREATE TYPE gender AS ENUM ('Female', 'Male');

/*Таблица кафедр*/
CREATE TABLE h_cathedras(
  id SERIAL PRIMARY KEY,
  name VARCHAR(50),
  phone_number VARCHAR(40)
);


/*Таблица научных работников(ими могут быть как студенты так и учителя)*/
CREATE TABLE h_scientists(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  second_name VARCHAR(30),
  gender gender,
  age INTEGER,
  phone_number VARCHAR(40)
);


/*Таблица учителей
  По сути относиться к таблице научных работников как 1 к 1*/
CREATE TABLE h_teachers(
  id INTEGER REFERENCES h_scientists(id) PRIMARY KEY,
  work_start_date DATE,
  work_cathedra_id INTEGER REFERENCES h_cathedras(id)
);


/*Таблица студентов
  По сути относиться к таблице научных работников как 1 к 1*/
CREATE TABLE h_students(
  id INTEGER REFERENCES h_scientists(id) PRIMARY KEY,
  specialty_name VARCHAR(50),
  start_date DATE,
  course INTEGER,
  diploma_ruler_id INTEGER REFERENCES h_teachers(id),
  diploma_theme VARCHAR(100),
  average_mark FLOAT
);


/*Таблица научных тем
  1)Отношение к таблице кафедр много к 1.
  На кафедре много тем, но у темы одна кафедра
  2)Отношение к таблице учителей(управляющий темой).
  У учителя может быть много тем в , но у темы один управляющий)
  3)Отношение к самой себе много к 1 через родительскую тему
  У темы может быть только одна родительская тема, но у темы может быть много тем-детей(ответвленных от нее тем)*/
CREATE TABLE h_scientific_themes(
  id SERIAL PRIMARY KEY,
  title VARCHAR(100),
  start_date DATE,
  end_date DATE,
  cathedra_id INTEGER references h_cathedras(id),
  manager_id INTEGER REFERENCES h_teachers(id),
  parent_theme_id INTEGER REFERENCES h_scientific_themes(id)
);



/*Вспомагательная таблица работ над темой, которая показывает отношение
  между таблицами научных тем и научных работников много к много*/
CREATE TABLE h_workings(
  id SERIAL PRIMARY KEY,
  scientist_id INTEGER REFERENCES h_scientists(id),
  scientific_theme_id INTEGER REFERENCES  h_scientific_themes(id),
  task_title VARCHAR(100),
  start_work_date DATE,
  end_work_date DATE
);




/*Удаление таблиц и типа гендер*/
DROP TABLE h_cathedras, h_scientists, h_teachers, h_students, h_scientific_themes, h_workings;
DROP TYPE gender;


/*C:\Users\Ярослав\.IntelliJIdea2018.2\config\consoles\db\acce1a73-4aa7-482d-a1ff-8cd8e595b368\homework04_1.sql*/