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

SELECT emp_name as �̸�,salary*12 as ����,(salary+(salary*bonus))*12 as "�Ѽ��ɾ�(���ʽ�+)",
(((salary+bonus)*12)-(salary*0.03*12)) as �Ǽ��ɾ� FROM EMPLOYEE;

select emp_name as �̸�,floor(sysdate-HIRE_date) as �ٹ��ϼ� from EMPLOYEE;--floor �Ҽ�����������.

SELECT emp_name �̸�,salary ����,bonus ���ʽ� from EMPLOYEE where ((sysdate-HIRE_DATE)/365)>=20;

SELECT job_code from EMPLOYEE;--�����ڵ�
SELECT DISTINCT job_code from EMPLOYEE;--�ߺ����� �ѹ��� ������ ����.

--���� ������
SELECT emp_id||emp_name from EMPLOYEE;
SELECT salary||'��'from EMPLOYEE;

--�� ������
SELECT emp_name,dept_code,salary from EMPLOYEE where dept_code ='D6' AND salary>=3000000;

--�� ������ : BETWEEN AND
SELECT EMP_NAME, SALARY FROM EMPLOYEE 
WHERE SALARY BETWEEN 3500000 AND 6000000;
--where salary>=3500000 and salary<=6000000 �� ����

--�� ������ : LIKE
SELECT emp_name from EMPLOYEE where emp_name like '��%';
--like �ڿ� ''�ȿ� ù���ڴ� ��,���۹��� �ڿ��� %(���ڿ� ���Ѿ���)/_(ã�� ������ ������ �ڸ���ä������.)

SELECT emp_name,email from EMPLOYEE;
--�̸����ּ���  _�տ� 3������ �̸��� �ּ� ���

SELECT emp_name,email from EMPLOYEE 
where email like '___#_%'ESCAPE '#';
--escape(������) �ڿ����� ���ڴ� ���ϵ�ī�忡�� ���ܵǰ� ���ڿ��� ����.
SELECT emp_name,email from EMPLOYEE 
where emp_name not Like '��%';
--���� �̾��� �ƴѻ���鸸 ���. 

--�� ������ IS NULL/IS NOT NULL
select emp_name, salary  from EMPLOYEE where bonus is null;
--is null �� null ���� ���Ҽ��ִ� �񱳹� row�� null���� ���ԵȰ�� ���.
select emp_name, salary  from EMPLOYEE where bonus is not null;
--�ݴ�� is not null �� null���� �ƴѰ�츦 ����.

--�� ������ IN/NOT IT
select emp_name,dept_code from EMPLOYEE where dept_code ='D6' or dept_code ='D9';
--dept_code ���� D6,D9�� ��츸 ���
select emp_name,dept_code from EMPLOYEE where dept_code in ('D6','D9','D1');
--or�� �����ʰ� �����ϰ� in�� ���̰� ���η� ������ dept �ڵ� �Է�.

--ORDER BY  1.select�� �÷��� ���� �����Ҷ� ��� 2.select�� ���� �������� �ۼ��ϸ�, ���� ������ ���� ������
--���Ĺ�� ASC:
--NUMBER:������->ū��/CHARCTER:������(A,B,C)/DATE:������->������ /NULL�� ���� �Ʒ���
--���Ĺ�� DSEC:
--NUMBER:ū��->������/CHARCTER:��������(C,B,A)/DATE:������->������ /NULL�� ���� ����
SELECT * FROM EMPLOYEE ORDER BY EMP_NAME ASC;--�̸� ������ ���/ASC �� �Է������ʾƵ� �ڵ����� ASC������� ����.
SELECT * FROM EMPLOYEE ORDER BY EMP_NAME DESC;--�̸� �������� ���
SELECT * FROM EMPLOYEE ORDER BY SALARY DESC;--�޿� ū>������ ���

SELECT EMP_NAME,EMAIL,DEPT_CODE, SALARY*12 ���� FROM EMPLOYEE ORDER BY '����';
--�⺻������ �������� ���� 
SELECT * FROM EMPLOYEE;

-- ����1. 
-- �Ի����� 5�� �̻�, 10�� ������ ������ �̸�,�ֹι�ȣ,�޿�,�Ի����� �˻��Ͽ���
SELECT EMP_NAME, EMP_NO, SALARY, HIRE_DATE FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) BETWEEN 5 AND 10;

-- ����2.
-- �������� �ƴ� ������ �̸�,�μ��ڵ带 �˻��Ͽ��� (��� ���� : ENT_YN)
SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE ENT_YN NOT IN ('N');

-- ����3.
-- �ټӳ���� 10�� �̻��� �������� �˻��Ͽ�
-- ��� ����� �̸�,�޿�,�ټӳ���� �ټӳ���� ������������ �����Ͽ� ����Ͽ���
-- ��, �޿��� 50% �λ�� �޿��� ��µǵ��� �Ͽ���.
SELECT EMP_NAME, SALARY * 1.5 AS SALARY, FLOOR((SYSDATE - HIRE_DATE) / 365) AS "�ټӳ��" FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) >= 10 ORDER BY "�ټӳ��";

-- ����4.
-- �Ի����� 99/01/01 ~ 10/01/01 �� ��� �߿��� �޿��� 2000000 �� ������ �����
-- �̸�,�ֹι�ȣ,�̸���,����ȣ,�޿��� �˻� �Ͻÿ�
SELECT EMP_NAME, EMP_NO, EMAIL, PHONE, SALARY FROM EMPLOYEE
WHERE (HIRE_DATE BETWEEN '99/01/01' AND '10/01/01') AND (SALARY <= 2000000);

-- ����5.
-- �޿��� 2000000�� ~ 3000000�� �� ������ �߿��� 4�� �����ڸ� �˻��Ͽ� 
-- �̸�,�ֹι�ȣ,�޿�,�μ��ڵ带 �ֹι�ȣ ������(��������) ����Ͽ���
SELECT EMP_NAME, EMP_NO, SALARY, DEPT_CODE FROM EMPLOYEE
WHERE (SALARY BETWEEN 2000000 AND 3000000) AND (EMP_NO LIKE '__04__-2%') ORDER BY EMP_NO;

-- ����6.
-- ���� ��� �� ���ʽ��� ���� ����� ���ñ��� �ٹ����� �����Ͽ� 
-- 1000�� ����(�Ҽ��� ����) 
-- �޿��� 10% ���ʽ��� ����Ͽ� �̸�,Ư�� ���ʽ� (��� �ݾ�) ����� ����Ͽ���.
-- ��, �̸� ������ ���� ���� �����Ͽ� ����Ͽ���.
SELECT EMP_NAME, (FLOOR((SYSDATE - HIRE_DATE) / 1000) * 0.1 * SALARY) AS "Ư�� ���ʽ�" FROM EMPLOYEE
WHERE (EMP_NO LIKE '%-1%') AND (BONUS IS NULL) ORDER BY EMP_NAME;