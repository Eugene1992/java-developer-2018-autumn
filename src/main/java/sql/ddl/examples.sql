CREATE TABLE "employees_cw" (
  id        SERIAL PRIMARY KEY,
  firstName VARCHAR(50) NOT NULL,
  lastName  VARCHAR(50),
  age       NUMERIC,
  salary    NUMERIC
);

DROP TABLE "employees_cw_renamed";

ALTER TABLE "employees_cw"
  RENAME TO "employees_cw_renamed";

ALTER TABLE "employees_cw_renamed"
  RENAME "salary" TO "salary_renamed";

ALTER TABLE "employees_cw_renamed"
  ADD COLUMN "new_column" NUMERIC;

ALTER TABLE "employees_cw_renamed"
  DROP COLUMN "new_column";

CREATE SCHEMA "test_schema";
DROP SCHEMA "test_schema";

ALTER TABLE "employees_cw_renamed"
  ADD COLUMN "new_column" NUMERIC NOT NULL;

INSERT INTO "employees_cw_renamed" (id, firstname, lastname, age, salary_renamed, new_column)
VALUES (1, 'a', 'b', 1, 1, NULL);

ALTER TABLE "employees_cw_renamed"
  ALTER COLUMN "new_column"
  DROP NOT NULL;

ALTER TABLE "employees_cw_renamed"
  ALTER COLUMN "new_column"
  SET DATA TYPE NUMERIC USING 10;

INSERT INTO "employees_cw_renamed" (firstname, lastname, age, salary_renamed, new_column)
VALUES ('a', 'b', 1, 1, NULL);

ALTER TABLE "employees_cw_renamed"
  ADD COLUMN "new_column_check" NUMERIC CHECK("new_column_check" > 0);

INSERT INTO "employees_cw_renamed" (firstname, lastname, age, salary_renamed, new_column, new_column_check)
VALUES ('a', 'b', 1, 1, NULL, -10);

ALTER TABLE "employees_cw_renamed"
  DROP CONSTRAINT "employees_cw_renamed_new_column_check_check";

ALTER TABLE "employees_cw_renamed"
  ADD COLUMN "new_column_unique" VARCHAR(20) UNIQUE ;

INSERT INTO "employees_cw_renamed" (firstname, lastname, age, salary_renamed, new_column, new_column_check, new_column_unique)
VALUES ('a', 'b', 1, 1, NULL, -10, 'a');