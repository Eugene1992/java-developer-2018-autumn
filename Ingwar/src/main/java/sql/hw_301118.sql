--используем имеющийся user

CREATE TABLE topic(
id SERIAL PRIMARY KEY,
title VARCHAR (50)
);

CREATE TABLE comment (
id SERIAL PRIMARY KEY,
user_id INT REFERENCES "user",
title VARCHAR (50),
text VARCHAR (200),
topic_id INT REFERENCES topic
);

CREATE TABLE comment_history (
id SERIAL PRIMARY KEY,
comment_id INT REFERENCES comment,
column_name VARCHAR (20),
old_value VARCHAR (200),
new_value VARCHAR (200),
edit_by INT REFERENCES "user",
edit_when DATE
);

CREATE OR REPLACE FUNCTION check_comment_changes() RETURNS TRIGGER AS $$
 DECLARE col RECORD;
 DECLARE curs CURSOR FOR SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='comment';
  --DECLARE col VARCHAR (20);
BEGIN
OPEN curs;
FETCH NEXT FROM curs INTO col;
WHILE @@FETCH_STATUS = 0 LOOP
--FOR col in (SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='comment') LOOP
  IF col.column_name <> 'id' THEN
  IF OLD[col.column_name] <> NEW[col.column_name] THEN
  INSERT INTO comment_history(comment_id,column_name,old_value,new_value,edit_by,edit_when)
   VALUES(OLD.id,col.column_name,OLD[col.name],NEW[col.name],NEW.user_id,current_date);
  END IF;
  END IF;
  FETCH NEXT FROM curs INTO col;
END LOOP;
CLOSE curs;
END
$$ LANGUAGE plpgsql;

SELECT column_names
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME='comment'