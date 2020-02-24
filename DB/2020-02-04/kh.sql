--select * from EMPLOYEE;
select EMP_NAME, EMP_NO, PHONE, EMAIL from EMPLOYEE where dept_code = 'D5' ORDER by EMP_NAME DESC;

--1. JOB ���̺� �� JOB_NAME ������ ���
--select job_name from job;
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
select emp_name, salary, (salary + salary * NVL(Bonus, 0)) * 12 as income from EMPLOYEE;