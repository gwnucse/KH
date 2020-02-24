--select * from EMPLOYEE;
select EMP_NAME, EMP_NO, PHONE, EMAIL from EMPLOYEE where dept_code = 'D5' ORDER by EMP_NAME DESC;

--1. JOB ���̺� �� JOB_NAME ������ ���
select job_name from job;
select * from job;
select * from EMPLOYEE;

--2. DEPARTMENT ���̺��� ��� ���� ���
select * from DEPARTMENT;
select * from NATIONAL;
select * from LOCATION;
select * from SAL_GRADE;

select EMPLOYEE.EMP_NAME, EMPLOYEE.EMP_NO, EMPLOYEE.PHONE, JOB.JOB_NAME from EMPLOYEE, JOB where EMPLOYEE.JOB_CODE = JOB.JOB_CODE;
select emp_id, emp_name, phone, min_sal, max_sal from employee, SAL_GRADE where employee.sal_level = sal_grade.sal_level order by emp_name;

--3. EMPLOYEE ���̺��� �̸�(EMP_NAME), �̸���(EMAIL), ��ȭ��ȣ(PHONE), �����(HIRE_DATE)�� ���
select EMP_NAME, EMAIL, PHONE, HIRE_DATE from EMPLOYEE;

--4. EMPLOYEE ���̺��� ������ 200���� �̻��� ����� �̸�(EMP_NAME)�� �޿�(SALARY) ���
select EMP_NAME, SALARY from EMPLOYEE where SALARY >= 2000000;
select emp_name, salary, (salary * 12) as income from EMPLOYEE;

--NVL(�÷�, NULL�� ��� ��ȯ��)���� NULLó��
select emp_name as �̸�, salary as ����, (salary + salary * NVL(Bonus, 0)) * 12 as "����(��)" from EMPLOYEE;

--���ͷ�
select emp_name, salary, '��' as ���� from EMPLOYEE;

select sysdate from dual;
SELECT SYSDATE - 1 FROM DUAL;
SELECT SYSDATE + 1 FROM DUAL;
SELECT (SYSDATE + 1) - SYSDATE FROM DUAL;

--1. EMPLOYEE ���̺��� �̸�,����, �Ѽ��ɾ�(���ʽ�����), �Ǽ��ɾ�(�� ���ɾ�-(����*���� 3%))�� ��µǵ��� �Ͻÿ�.
SELECT 
EMP_NAME, (SALARY * 12) AS "����(��)", (SALARY + NVL(BONUS, 0) * 12) AS "�Ѽ��ɾ�(��)", 
((SALARY + NVL(BONUS, 0) * 12)  - (SALARY * 0.03 * 12)) AS "�Ǽ��ɾ�(��)" FROM EMPLOYEE;

--2. EMPLOYEE ���̺��� �̸�, �ٹ� �ϼ��� ����غ��ÿ� (SYSDATE�� ����ϸ� ���� �ð� ���)
SELECT EMP_NAME, FLOOR(SYSDATE - HIRE_DATE) AS "�ٹ� �ϼ�" FROM EMPLOYEE;

--3. EMPLOYEE ���̺��� 20�� �̻� �ټ����� �̸�,����,���ʽ����� ����Ͻÿ�
SELECT EMP_NAME, SALARY, BONUS FROM EMPLOYEE WHERE (SYSDATE - HIRE_DATE) >= 365 * 20;

SELECT DISTINCT JOB_CODE FROM EMPLOYEE;

--���� ������
SELECT EMP_ID||' '||EMP_NAME AS NAME FROM EMPLOYEE;
SELECT SALARY||'��' FROM EMPLOYEE;

--�� ������
SELECT EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE
WHERE DEPT_CODE = 'D6' AND SALARY >= 3000000;

--�� ������(BETWEEN AND)
SELECT EMP_NAME, SALARY FROM EMPLOYEE
--WHERE SALARY >= 3500000 AND SALARY <= 6000000;
WHERE SALARY BETWEEN 3500000 AND 6000000;

--�� ������(LIKE)
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_NAME LIKE '��%';
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_NAME LIKE '��__';

SELECT EMP_NAME, EMAIL FROM EMPLOYEE;
--�̸��� �ּ� �� _ �տ� 3������ �̸��� �ּ� ���
SELECT EMP_NAME, EMAIL FROM EMPLOYEE
WHERE EMAIL LIKE'___#_%' ESCAPE '#';
--�̸��� �ּ� �� _ �տ� 3���ڰ� �ƴ� �̸��� �ּ� ���
SELECT EMP_NAME, EMAIL FROM EMPLOYEE
WHERE EMAIL LIKE'___#_%' ESCAPE '#';

--���ʽ��� ���� �ʴ� ������ �̸��� �޿� ��ȸ
SELECT EMP_NAME, SALARY FROM EMPLOYEE
WHERE BONUS IS NULL;

SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
--WHERE DEPT_CODE = 'D6' OR DEPT_CODE = 'D9' OR DEPT_CODE = 'D1';
WHERE DEPT_CODE IN ('D6', 'D9', 'D1') ORDER BY EMP_NAME;

SELECT * FROM EMPLOYEE
--ORDER BY EMP_NAME DESC
;

SELECT EMP_NAME, EMAIL, DEPT_CODE, SALARY �޿�, SALARY * 12 ����
FROM EMPLOYEE ORDER BY 1;

-- ����1. 
-- �Ի����� 5�� �̻�, 10�� ������ ������ �̸�,�ֹι�ȣ,�޿�,�Ի����� �˻��Ͽ���
SELECT EMP_NAME, EMP_NO, SALARY, HIRE_DATE FROM EMPLOYEE
WHERE (SYSDATE - HIRE_DATE) / 365 BETWEEN 5 AND 10;

-- ����2.
-- �������� �ƴ� ������ �̸�,�μ��ڵ带 �˻��Ͽ��� (��� ���� : ENT_YN)
SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE ENT_YN NOT IN('N');

-- ����3.
-- �ټӳ���� 10�� �̻��� �������� �˻��Ͽ�
-- ��� ����� �̸�,�޿�,�ټӳ���� �ټӳ���� ������������ �����Ͽ� ����Ͽ���
-- ��, �޿��� 50% �λ�� �޿��� ��µǵ��� �Ͽ���.
SELECT EMP_NAME, SALARY * 1.5 AS SALARY, FLOOR((SYSDATE - HIRE_DATE) / 365) AS "�ټӳ��" FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) >= 10 ORDER BY "�ټӳ��";

-- ����4.
-- �Ի����� 99/01/01 ~ 10/01/01 �� ��� �߿��� �޿��� 2000000 �� ������ �����
-- �̸�,�ֹι�ȣ,�̸���,����ȣ,�޿��� �˻� �Ͻÿ�
-- ����5.
-- �޿��� 2000000�� ~ 3000000�� �� ������ �߿��� 4�� �����ڸ� �˻��Ͽ� 
-- �̸�,�ֹι�ȣ,�޿�,�μ��ڵ带 �ֹι�ȣ ������(��������) ����Ͽ���
-- ����6.
-- ���� ��� �� ���ʽ��� ���� ����� ���ñ��� �ٹ����� �����Ͽ� 
-- 1000�� ����(�Ҽ��� ����) 
-- �޿��� 10% ���ʽ��� ����Ͽ� �̸�,Ư�� ���ʽ� (��� �ݾ�) ����� ����Ͽ���.
-- ��, �̸� ������ ���� ���� �����Ͽ� ����Ͽ���.