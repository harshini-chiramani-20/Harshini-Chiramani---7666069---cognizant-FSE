DECLARE
    num NUMBER := 10;
    counter NUMBER := 1;
BEGIN

    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is Positive');
    ELSIF num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number is Negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is Zero');
    END IF;

    LOOP

        DBMS_OUTPUT.PUT_LINE('Counter = ' || counter);

        counter := counter + 1;

        EXIT WHEN counter > 5;

    END LOOP;

END;
/