SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE display_employee(
    emp_name IN VARCHAR2,
    salary IN NUMBER
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || emp_name);
    DBMS_OUTPUT.PUT_LINE('Salary : ' || salary);
END;
/

BEGIN
    display_employee('Harshini', 50000);
END;
/