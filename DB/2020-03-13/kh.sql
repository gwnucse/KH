
SET SERVEROUTPUT ON;

--1. BASIC LOOP : ���� ���� ���� �ݺ�
DECLARE
    I NUMBER := 1;
BEGIN
    LOOP        --�ݺ� ����
        DBMS_OUTPUT.PUT_LINE(I);
        I := I + 1;
        IF I > 5 
            THEN EXIT;
        END IF;
    END LOOP;   --�ݺ� ������
END;
/

--2. FOR LOOP
DECLARE
BEGIN
    FOR I IN REVERSE 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
    END LOOP;
END;
/

DECLARE
    USERINFO EMPLOYEE%ROWTYPE;
BEGIN
    FOR I IN 0..22 LOOP
        SELECT *
        INTO USERINFO
        FROM EMPLOYEE WHERE EMP_ID = 200 + I;
        DBMS_OUTPUT.PUT_LINE('�̸� : ' || USERINFO.EMP_NAME);
        DBMS_OUTPUT.PUT_LINE('�޿� : ' || USERINFO.SALARY);
        DBMS_OUTPUT.PUT_LINE(' ');
    END LOOP;
END;
/

--WHILE
DECLARE
    I NUMBER := 1;
BEGIN
    WHILE I <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
        I := I + 1;
    END LOOP;
END;
/
