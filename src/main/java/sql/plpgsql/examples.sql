CREATE OR REPLACE FUNCTION concat_str(VARCHAR(20), VARCHAR(20))
  RETURNS VARCHAR(100) AS $$

BEGIN
  RETURN $1 || ' ' || $2;
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION summarize(NUMERIC, NUMERIC)
  RETURNS NUMERIC AS $$
DECLARE
  a ALIAS FOR $1;
  b ALIAS FOR $2;
  sum NUMERIC;
BEGIN
  sum = a + b;
  RETURN sum;
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION is_even(NUMERIC)
  RETURNS BOOLEAN AS $$
DECLARE
  a ALIAS FOR $1;
BEGIN
  IF a % 2 = 0
  THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;
END;
$$ LANGUAGE PLPGSQL;


CREATE OR REPLACE FUNCTION my_factorial(NUMERIC)
  RETURNS NUMERIC AS $$
DECLARE
  a ALIAS FOR $1;
  res NUMERIC = 1;
BEGIN
  FOR tmp IN 1 .. a LOOP
    res = res * tmp;
  END LOOP;
  RETURN res;
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION my_while_factorial(NUMERIC)
  RETURNS NUMERIC AS $$
DECLARE
  a ALIAS FOR $1;
  res NUMERIC = 1;
  tmp NUMERIC = 1;
BEGIN
  WHILE tmp <= a LOOP
    res = res * tmp;
    tmp = tmp + 1;
  END LOOP;
  RETURN res;
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION populate_dummy(NUMERIC)
  RETURNS TABLE(a NUMERIC) AS $$
DECLARE
  count ALIAS FOR $1;
BEGIN
  FOR tmp IN 1 .. count LOOP
    EXECUTE 'INSERT INTO dummy VALUES(' || round(random() * 10) || ')';
  END LOOP;
  EXECUTE 'SELECT * FROM dummy';
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION calculate_dummy_sum()
  RETURNS NUMERIC AS $$
DECLARE
  tmp RECORD;
  sum NUMERIC = 0;
BEGIN
  FOR tmp IN SELECT dummy.value
             FROM dummy LOOP
    sum = sum + tmp.value;
  END LOOP;
  RETURN sum;
END;
$$ LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION get_dummy_values(more_than NUMERIC)
  RETURNS TABLE(
    v NUMERIC
  )
AS $$
BEGIN
  RETURN QUERY SELECT
                 value FROM dummy WHERE dummy.value > more_than;
END; $$ LANGUAGE 'plpgsql';

DROP FUNCTION populate_dummy


DROP FUNCTION concat_str( VARCHAR(20), VARCHAR(20) )

SELECT concat_str('Hello', 'world');
SELECT summarize(1, 2);
SELECT
  is_even(6),
  is_even(7);
SELECT my_factorial(5);
SELECT my_while_factorial(5);
SELECT populate_dummy(5)
SELECT calculate_dummy_sum()
SELECT get_dummy_values(5)

CREATE TABLE dummy (
  value NUMERIC
)

TRUNCATE dummy

SELECT *
FROM dummy
