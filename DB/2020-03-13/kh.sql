
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

-- TOP N �м��� ���� PL/SQL�� ������
-- '�޿�'/'���ʽ�'/'�Ի���'
-- ������ 1��~5�������� ����ϴ� PL/SQL�� ������.
SELECT ����, EMP_NAME, SALARY
FROM (
    SELECT EMP_NAME, SALARY,
    RANK() OVER(ORDER BY SALARY DESC) AS ����
    FROM EMPLOYEE
)
WHERE ���� = 2;

SELECT EMP_NAME, NVL(BONUS, 0) AS BONUS,
RANK() OVER(ORDER BY BONUS DESC NULLS LAST) AS ����
FROM EMPLOYEE;

SELECT EMP_NAME, NVL(BONUS, 0)
FROM (
    SELECT EMP_NAME, NVL(BONUS, 0) AS BONUS,
    ROW_NUMBER() OVER(ORDER BY BONUS DESC NULLS LAST) AS ����
    FROM EMPLOYEE
)
WHERE ���� = 3;

DECLARE
    EMP EMPLOYEE%ROWTYPE;
    SEL_LANK VARCHAR2(20);
BEGIN
    SEL_LANK := '&��ŷ';
    
    DBMS_OUTPUT.PUT_LINE('-------- ' || SEL_LANK || ' ��ŷ TOP 5 --------');
    
    FOR I IN 1..5 LOOP
        IF SEL_LANK = '�޿�'
        THEN
            SELECT EMP_NAME, SALARY
            INTO EMP.EMP_NAME, EMP.SALARY
            FROM (
                SELECT EMP_NAME, SALARY,
                ROW_NUMBER() OVER(ORDER BY SALARY DESC) AS ����
                FROM EMPLOYEE)
            WHERE ���� = I;
            DBMS_OUTPUT.PUT_LINE('��ŷ : ' || I || '/�̸� : ' || EMP.EMP_NAME ||'/�޿� : ' || EMP.SALARY);
        ELSIF SEL_LANK = '���ʽ�'
        THEN
            SELECT EMP_NAME, NVL(BONUS, 0)
            INTO EMP.EMP_NAME, EMP.BONUS
            FROM (
                SELECT EMP_NAME, BONUS,
                ROW_NUMBER() OVER(ORDER BY BONUS DESC NULLS LAST) AS ����
                FROM EMPLOYEE)
            WHERE ���� = I;
            DBMS_OUTPUT.PUT_LINE('��ŷ : ' || I || '/�̸� : ' || EMP.EMP_NAME ||'/���ʽ� : ' || EMP.BONUS || '%');
        ELSIF SEL_LANK = '�Ի���'
        THEN 
            SELECT EMP_NAME, HIRE_DATE
            INTO EMP.EMP_NAME, EMP.HIRE_DATE
            FROM (
                SELECT EMP_NAME, HIRE_DATE,
                ROW_NUMBER() OVER(ORDER BY HIRE_DATE) AS ����
                FROM EMPLOYEE)
            WHERE ���� = I;
            DBMS_OUTPUT.PUT_LINE('��ŷ : ' || I || '/�̸� : ' || EMP.EMP_NAME ||'/�Ի��� : ' || EMP.HIRE_DATE);
        ELSE
            DBMS_OUTPUT.PUT_LINE('�߸� �Է��ϼ̽��ϴ�.');
            EXIT;
        END IF;
    END LOOP;
END;
/
