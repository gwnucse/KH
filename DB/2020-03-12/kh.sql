
CREATE OR REPLACE VIEW EMP_VIEW
AS
SELECT EMP_ID, EMP_NAME, EMAIL, PHONE FROM EMPLOYEE;

CREATE OR REPLACE VIEW EMP_VIEW1
AS 
SELECT EMP_ID, EMAIL FROM EMPLOYEE;

CREATE TABLE EMP_COPY
AS
SELECT EMP_ID, EMP_NAME, EMAIL, PHONE FROM EMPLOYEE;

SELECT * FROM EMPLOYEE;
SELECT * FROM EMP_VIEW;
SELECT * FROM EMP_COPY;

UPDATE EMP_VIEW
SET PHONE = '01099999999'
WHERE EMP_ID = 200;

UPDATE EMPLOYEE
SET PHONE = '01000000000'
WHERE EMP_ID = 200;

ROLLBACK;

--SEQUENCE
CREATE SEQUENCE SEQ_ID
START WITH 100  -- ���۰� 100
INCREMENT BY 1  -- 1�� ����
MAXVALUE 1000   --�ִ밪 1000
NOCYCLE         --1000���Ŀ� �������� �ʰ� ���� �߻�
NOCACHE;        --ĳ�� ��� ����

SELECT SEQ_ID.NEXTVAL, EMPLOYEE.* FROM EMPLOYEE;
SELECT SEQ_ID.CURRVAL FROM DUAL;


CREATE TABLE SEQ_TBL(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_ID VARCHAR2(20) UNIQUE,
    MEMBER_PW VARCHAR2(30) NOT NULL
);

CREATE SEQUENCE SEQ_TEST
START WITH 1
INCREMENT BY 2
MAXVALUE 3
NOCYCLE
NOCACHE;

INSERT INTO SEQ_TBL VALUES(
    SEQ_TEST.NEXTVAL, 'user01', 'pass01');
INSERT INTO SEQ_TBL VALUES(
    SEQ_TEST.NEXTVAL, 'user02', 'pass02');
INSERT INTO SEQ_TBL VALUES(
    SEQ_TEST.NEXTVAL, 'user03', 'pass03');
INSERT INTO SEQ_TBL VALUES(
    SEQ_TEST.NEXTVAL, 'user04', 'pass04');
    
SELECT * FROM SEQ_TBL;
SELECT MAX(MEMBER_NO) FROM SEQ_TBL;

ALTER SEQUENCE SEQ_TEST
INCREMENT BY 1
MAXVALUE 1000
NOCYCLE
NOCACHE;

DROP SEQUENCE SEQ_TEST;

--INDEX
CREATE INDEX EMP_IDD_NDD ON EMPLOYEE
(EMP_NAME, EMP_NO, HIRE_DATE);
DROP INDEX EMP_IDD_NDD;

SELECT EMP_NAME, EMP_NO, HIRE_DATE FROM EMPLOYEE;

--SYNONYM
--����� ���Ǿ�
CREATE SYNONYM EMP FOR EMPLOYEE;
SELECT * FROM EMP;
DROP SYNONYM EMP;

--PL/SQL�� �̿��� ��¹��� ����ϱ� ���� ����
SET SERVEROUTPUT ON;

BEGIN
    DBMS_OUTPUT.PUT_LINE('HELLO WORLD');
    DBMS_OUTPUT.PUT_LINE('HELLO ORACLE');
END;
/

DECLARE
    MSG VARCHAR2(20);
BEGIN
    MSG := '&�Է�';
    DBMS_OUTPUT.PUT_LINE(MSG);
END;
/

DECLARE
    NAME VARCHAR2(9);
    SAL NUMBER;
BEGIN
    SELECT EMP_NAME, SALARY
    INTO NAME, SAL
    FROM EMPLOYEE
    WHERE EMP_ID = '&EMP_ID';
    DBMS_OUTPUT.PUT_LINE('�̸� : '||NAME);
    DBMS_OUTPUT.PUT_LINE('�޿� : '||SAL);
END;
/

--�ش� ����� �����ȣ �Է½� �̸�, �μ��ڵ�, �����ڵ� ���
SELECT * FROM EMPLOYEE;

DECLARE
    NAME VARCHAR(9);
    DEPT VARCHAR(3);
    JOB VARCHAR(3);
BEGIN
    SELECT EMP_NAME, DEPT_CODE, JOB_CODE
    INTO NAME, DEPT, JOB
    FROM EMPLOYEE
    WHERE EMP_ID = &�����ȣ;
    DBMS_OUTPUT.PUT_LINE('�̸� : '||NAME);
    DBMS_OUTPUT.PUT_LINE('�μ��ڵ� : '||DEPT);
    DBMS_OUTPUT.PUT_LINE('�����ڵ� : '||JOB);
END;
/

--�ش� ����� �����ȣ �Է½� �̸�, �μ���, ���޸� ���
SELECT * FROM DEPARTMENT;
SELECT * FROM JOB;
DECLARE
    EMP_NAME VARCHAR(9);
    DEPT_NAME VARCHAR(30);
    JOB_NAME VARCHAR(30);
BEGIN
    SELECT EMP_NAME, DEPT_TITLE, JOB_NAME
    INTO EMP_NAME, DEPT_NAME, JOB_NAME
    FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
    LEFT JOIN JOB USING(JOB_CODE)
    WHERE EMP_ID = '&�����ȣ';
    DBMS_OUTPUT.PUT_LINE('�̸� : '||EMP_NAME);
    DBMS_OUTPUT.PUT_LINE('�μ��ڵ� : '||DEPT_NAME);
    DBMS_OUTPUT.PUT_LINE('�����ڵ� : '||JOB_NAME);
END;
/

