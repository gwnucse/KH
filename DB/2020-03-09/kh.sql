
--SUM�� �׷��Լ��̱⿡ �������� ��µǴ� DEPT_CODE�� ������ �����.
SELECT DEPT_CODE, SUM(SALARY) FROM EMPLOYEE;
SELECT DEPT_CODE FROM EMPLOYEE;
SELECT SUM(SALARY) FROM EMPLOYEE;

--�׷��Լ��� SUM�� ���ÿ� ����ϱ� ���ؼ��� GROUP BY�� �׷��Լ��� �ƴ� ���� ���� �ʿ䰡 �ִ�.
SELECT DEPT_CODE, SUM(SALARY), FLOOR(AVG(SALARY)) AS "���", COUNT(*) AS "�ο�"
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--���� ���� �÷��� GROUP BY�� �����ϴ�.
SELECT
    DECODE(SUBSTR(EMP_NO, 8, 1), 1, '��', 2, '��') AS "����",
    FLOOR(AVG(SALARY)) AS "���",
    SUM(SALARY) AS "�հ�",
    COUNT(*) AS "�ο���"
FROM EMPLOYEE
GROUP BY DECODE(SUBSTR(EMP_NO, 8, 1), 1, '��', 2, '��');

--�μ��� ��� �޿�
SELECT DEPT_CODE, FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING FLOOR(AVG(SALARY)) > 3000000;