
--LENGTH �Լ�
SELECT EMP_NAME, LENGTH(EMP_NAME) AS �̸�����, EMAIL, LENGTH(EMAIL) AS �̸��ϱ��� FROM EMPLOYEE;
SELECT EMP_NAME, LENGTHB(EMP_NAME) AS �̸�ũ��, EMAIL, LENGTHB(EMAIL) AS �̸���ũ�� FROM EMPLOYEE;

--INSTR �Լ�
SELECT INSTR('Hello World Hi High', 'H', 1, 1) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 1, 2) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 1, 3) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', -1, 1) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', -1, 2) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 2, 1) FROM DUAL;

--�ǽ�
--EMAIL �÷� �߿��� @���� ��ġ�� ���Ͻÿ�.
SELECT INSTR(EMAIL, '@', 1, 1) FROM EMPLOYEE;

--LPAD/RPAD
SELECT LPAD(EMAIL, 20, '#') FROM EMPLOYEE;
SELECT LPAD(EMAIL, 10, '#') FROM EMPLOYEE;
SELECT RPAD(EMAIL, 20, '#') FROM EMPLOYEE;
SELECT RPAD(EMAIL, 10, '#') FROM EMPLOYEE;

--LTRIM/RTRIM
SELECT '   KH   ' FROM DUAL;
SELECT LTRIM('   KH   ', ' ')FROM DUAL;
SELECT LTRIM('00012034560', '0') FROM DUAL;
SELECT LTRIM('ACABACCKH', 'ABC') FROM DUAL;
SELECT LTRIM('568543545943216549870KH', '0123456789') FROM DUAL;
SELECT RTRIM('568543545943216549870KH', '0123456789') FROM DUAL;
SELECT LTRIM(RTRIM('568543545943216549870KH12125514256542184251413', '0123456789'), '0123456789') FROM DUAL;

--TRIM
SELECT TRIM('Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(BOTH 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(LEADING 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(TRAILING 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;

-- �ǽ� ���� 1
-- Hello KH Java ���ڿ��� Hello KH �� ��µǰ� �Ͽ���.
SELECT RTRIM('Hello KH Java', 'Java ') FROM DUAL;
SELECT TRIM(TRAILING 'Java' FROM 'Hello KH Java') FROM DUAL;

-- �ǽ� ���� 2
-- Hello KH Java ���ڿ��� KH Java �� ��µǰ� �Ͽ���.
SELECT LTRIM('Hello KH Java', 'Hello ') FROM DUAL;

-- �ǽ� ���� 3 (TRIM���� �غ�����)
-- DEPARTMENT ���̺��� DEPT_TITLE�� ����Ͽ���
-- �̶�, ������ �� ���ڸ� ���� ��µǵ��� �Ͽ��� / ex)ȸ������� -> ȸ�����
SELECT * FROM DEPARTMENT;
SELECT TRIM(TRAILING '��' FROM DEPT_TITLE) FROM DEPARTMENT;

-- �ǽ� ���� 4
-- �������ڿ����� �յ� ��� ���ڸ� �����ϼ���.
-- '982341678934509hello89798739273402'
SELECT RTRIM(LTRIM('982341678934509hello89798739273402', '0123456789'), '0123456789') FROM DUAL;

--SUBSTR
SELECT 'SHOWMETHEMONEY' FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', 5, 2) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', 5) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', -8, 3) FROM DUAL;

-- 1. ������� ���� �ߺ����� ���������� ����ϼ���.
SELECT * FROM EMPLOYEE;
SELECT DISTINCT SUBSTR(EMP_NAME, 1, 1) AS "��" FROM EMPLOYEE ORDER BY 1;

-- 2. EMPLOYEE ���̺��� ���ڸ�
-- �����ȣ, �����, �ֹι�ȣ, ������ ��Ÿ������.
-- �ֹι�ȣ�� �� 6�ڸ��� *ó���ϼ���.
SELECT EMP_ID, EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') AS �ֹι�ȣ, SALARY FROM EMPLOYEE WHERE EMP_NO LIKE '%-1%' OR EMP_NO LIKE '%-3%';
--���ͷ��� �̿��� �� 6�ڸ��� *ó���� �Ѵ�.
SELECT EMP_ID, EMP_NAME, SUBSTR(EMP_NO, 1, 8)||'******' AS �ֹι�ȣ, SALARY FROM EMPLOYEE WHERE EMP_NO LIKE '%-1%' OR EMP_NO LIKE '%-3%';

--LOWER/UPPER/INITCAP
SELECT LOWER('Welcome To My World') FROM DUAL;
SELECT UPPER('Welcome To My World') FROM DUAL;
SELECT INITCAP('welcome to my world') FROM DUAL;

--CONCAT
SELECT CONCAT('ABCD', '�����ٶ�') FROM DUAL;

--REPLACE
SELECT REPLACE('ABCDEFG', 'DEF', '�ѱ�') FROM DUAL;

--EMPLOYEE ���̺��� ��� ������ �̸�, �ֹι�ȣ, EMAIL�� ����Ͻÿ�
--��, ��½� EMAIL�� kh.or.kr���� iei.or.kr
--�� �����Ͽ� ��µǰ� �Ͻÿ�
--ex) sum_di@kh.or.kr -> sum_di@iei.or.kr
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, EMP_NO, REPLACE(EMAIL, 'kh.or.kr', 'iei.or.kr') AS EMAIL FROM EMPLOYEE;

--ABS
SELECT ABS(10) FROM DUAL;
SELECT ABS(-10) FROM DUAL;

--MOD
SELECT MOD(10, 2) FROM DUAL; --������ 0
SELECT MOD(10, 3) FROM DUAL; --������ 1
SELECT MOD(10, 4) FROM DUAL; --������ 2

--ROUND
SELECT ROUND(126.456) FROM DUAL;
SELECT ROUND(126.456, 2) FROM DUAL;
SELECT ROUND(126.456, 0) FROM DUAL;
SELECT ROUND(126.456, -2) FROM DUAL;

--FLOOR
SELECT FLOOR(126.55) FROM DUAL;

--CEIL
SELECT CEIL(126.11) FROM DUAL;

--SYSDATE
SELECT SYSDATE FROM DUAL;
SELECT SYSDATE, CURRENT_DATE, LOCALTIMESTAMP, CURRENT_TIMESTAMP FROM DUAL;

--MONTHS_BETWEEN
SELECT EMP_NAME, FLOOR(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS "DATE" FROM EMPLOYEE;
DESC EMPLOYEE;

--ADD_MONTHS
SELECT EMP_NAME, ADD_MONTHS(HIRE_DATE, 3) FROM EMPLOYEE;

/*�ǽ�
���Ǿ��� ���� �ٽ� �Դ�
�����Ⱓ�� 1�� 6����
1. �Դ� ��¥
2. �����ϴ� ��¥
3. �Ծ�� �ϴ� «�� ��(�Ϸ� 3��)
DUAL ���̺� �̿��ؼ� ���
*/
SELECT SYSDATE AS "�Դ���", ADD_MONTHS(SYSDATE, 18) AS "������", (ADD_MONTHS(SYSDATE, 18) - SYSDATE) * 3 AS "«�� ��" FROM DUAL;

--NEXT_DAY : �Է¹��� ���� ������ ����Ѵ�.
SELECT SYSDATE, NEXT_DAY(SYSDATE, '������') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'ȭ����') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��') FROM DUAL;
--1 : �Ͽ���, 2 : ������, ... 7 : �����
SELECT SYSDATE, NEXT_DAY(SYSDATE, 2) FROM DUAL;

--LAST_DAY : �Է¹��� ��¥�� ���� �ش��ϴ� ������ ���� ����Ѵ�.
SELECT SYSDATE, LAST_DAY(SYSDATE + 10) FROM DUAL;

--EXTRACT
SELECT EXTRACT(YEAR FROM SYSDATE), EXTRACT(MONTH FROM SYSDATE), EXTRACT(DAY FROM SYSDATE) FROM DUAL;

/*�ǽ����� 1
EMPLOYEE ���̺��� ����� �̸�, �Ի���, ������ ����Ͽ���.
��, �Ի����� YYYY��M��D�Ϸ� ����ϵ��� �Ͽ���.
���� ����� �Ҽ����ϰ�� �ø����� �Ͽ� ����Ͽ���.
(28.144 -> 29����)
��½� ������ �Ի��� �������� ��������
*/
SELECT * FROM EMPLOYEE;
SELECT 
    EMP_NAME, 
    EXTRACT(YEAR FROM HIRE_DATE)||'��'||EXTRACT(MONTH FROM HIRE_DATE)||'��'||EXTRACT(DAY FROM HIRE_DATE)||'��' AS "�Ի���", 
    CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12) AS "�Ի����" 
FROM EMPLOYEE ORDER BY 2;

--TO_CHAR
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/DAY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/DY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD AMHH"��"MI"��"SS"��"') AS "TIME" FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD HH24"��"MI"��"SS"��"') AS "TIME" FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'FMYYYY/MM/DD HH24"��"MI"��"SS"��"') AS "TIME" FROM DUAL;
SELECT 
    TO_CHAR(5000000, '999,999,999'),
    TO_CHAR(5000000, '000,000,000'),
    TO_CHAR(5000000, '999,999'),
    --�ڸ����� ���ڶ�� �������� ���ڰ� ����� �ȵȴ�.
    TO_CHAR(5000000, '$999,999,999'),
    TO_CHAR(5000000, 'L999,999,999')
FROM DUAL;

--TO_DATE
SELECT TO_DATE(20000101, 'YYYYMMDD') FROM DUAL;
SELECT TO_CHAR(TO_DATE(20000101100231, 'YYYYMMDDHHMISS'), 'YYYY/MM/DD HH24:MI:SS') FROM DUAL;

--EMPLOYEE ���̺��� 2000�⵵ ���Ŀ� �Ի��� ����� �̸��� �Ի����� ���
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE WHERE TO_CHAR(HIRE_DATE, 'YYYY') >= 2000;
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE WHERE TO_DATE(20000101, 'YYYYMMDD') <= HIRE_DATE;

--TO_NUMBER
SELECT TO_NUMBER('5,000,000', '9,999,999') FROM DUAL;
SELECT TO_NUMBER('123A') FROM DUAL; --����
SELECT '1000' + '100' FROM DUAL;

--NVL
SELECT NVL(BONUS, 0) AS "BONUS" FROM EMPLOYEE;
SELECT EMP_NAME, (SALARY + (SALARY * NVL(BONUS, 0))) * 12 FROM EMPLOYEE;

--DECODE �����Լ�
--�������� ��쿡 ������ �� �ִ� ����� ����
SELECT EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO, 8, 1), '1', '����', '2', '����') AS "����" FROM EMPLOYEE;

--CASE �����Լ�
--�������� ��쿡 ������ �� �ִ� ����� ����(���� �� ����)
SELECT EMP_NAME, EMP_NO,
    CASE WHEN SUBSTR(EMP_NO, 8, 1) = 1 THEN '����'
    WHEN SUBSTR(EMP_NO, 8, 1) = 2 THEN '����'
    ELSE '�̼�����' END AS ����
FROM EMPLOYEE;

SELECT EMP_NAME, EMP_NO,
    CASE 
        WHEN SUBSTR(EMP_NO, 1, 2) < 65 THEN '60��� �ʹ�'
        WHEN SUBSTR(EMP_NO, 1, 2) >= 65 THEN '60��� �Ĺ�'
    END AS ����
FROM EMPLOYEE WHERE SUBSTR(EMP_NO, 1, 2) BETWEEN 60 AND 69;

--SUM
SELECT SUM(SALARY) FROM EMPLOYEE WHERE SUBSTR(EMP_NO, 8, 1) = 1 AND DEPT_CODE = 'D5';

--AVG
SELECT ROUND(AVG(NVL(BONUS, 0)), 2) FROM EMPLOYEE;

--COUNT
SELECT COUNT(*) FROM EMPLOYEE;
SELECT COUNT(BONUS) FROM EMPLOYEE;
SELECT COUNT(NVL(BONUS, 0)) FROM EMPLOYEE;

--MAX, MIN
SELECT MAX(SALARY), MIN(SALARY) FROM EMPLOYEE;
SELECT MAX(HIRE_DATE), MIN(HIRE_DATE) FROM EMPLOYEE;

SELECT EMP_NAME, COUNT(BONUS) FROM EMPLOYEE;

--1. ������� �̸��� , �̸��� ���̸� ����Ͻÿ�.
SELECT EMP_NAME, EMAIL, LENGTH(EMAIL) AS ���� FROM EMPLOYEE;

--2. ������ �̸��� �̸��� �ּ��� ���̵� �κи� ����Ͻÿ�.
SELECT EMP_NAME, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') - 1) AS "�̸��� ���̵�" FROM EMPLOYEE;

--3. 60������ ������� ���, ���ʽ� ���� ����Ͻÿ�. �׶� ���ʽ� ���� null�� ��쿡�� 0 �̶�� ��� �ǰ� ����ÿ�.
SELECT SUBSTR(EMP_NO, 1, 2) FROM EMPLOYEE ORDER BY 1;
SELECT EMP_NAME, SUBSTR(EMP_NO, 1, 2) AS ���, NVL(BONUS, 0) AS ���ʽ� FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 1, 2) BETWEEN 60 AND 69;

--4. '010' �ڵ��� ��ȣ�� ���� �ʴ� ����� ���� ����Ͻÿ� (�ڿ� ������ ���� ���̽ÿ�)
SELECT COUNT(*)||'��' FROM EMPLOYEE
WHERE SUBSTR(PHONE, 1, 3) != '010';

----5. ������� �Ի����� ����Ͻÿ�. ��, �Ʒ��� ���� ��µǵ��� ����� ���ÿ�
--	    ������		�Ի���
--	ex) ������		2012��12��
--	ex) ������		1997�� 3��
SELECT EMP_NAME AS ������, 
EXTRACT(YEAR FROM HIRE_DATE)||'��'
||LPAD(EXTRACT(MONTH FROM HIRE_DATE), 2, ' ')||'��' AS �Ի���
FROM EMPLOYEE;

--6. ������� �ֹι�ȣ�� ��ȸ�Ͻÿ�
--	��, �ֹι�ȣ 9��° �ڸ����� �������� '*' ���ڷ� ä������� �Ͻÿ�.
--	ex) ȫ�浿 771120-1******
SELECT EMP_NAME AS ������, SUBSTR(EMP_NO, 1, 8)||'******' AS �ֹι�ȣ
FROM EMPLOYEE;

--7. ������, �����ڵ�, ����(��) ��ȸ�Ͻÿ�.
--  ��, ������ ��57,000,000 ���� ǥ�õǰ� ��
--     ������ ���ʽ�����Ʈ�� ����� 1��ġ �޿���
SELECT EMP_NAME, JOB_CODE, 
    TO_CHAR(((SALARY + SALARY * NVL(BONUS, 0)) * 12), 'L999,999,999') AS ����
FROM EMPLOYEE;

--8. �μ��ڵ尡 D5, D9�� ������ �߿��� 2004�⵵�� �Ի��� ������ ��� ����� �μ��ڵ� �Ի����� ����Ͻÿ�.
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE;
SELECT EMP_ID, EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE DEPT_CODE IN('D5', 'D9') AND SUBSTR(HIRE_DATE, 1, 2) = '04';

--9. ������, �Ի���, ���ñ����� �ٹ��ϼ� ��ȸ 
--	* �ָ��� ���� , �Ҽ��� �Ʒ��� ����
SELECT EMP_NAME, HIRE_DATE, FLOOR(SYSDATE - HIRE_DATE)||'��' AS "�ٹ��ϼ�" FROM EMPLOYEE;

--10. ��� ������ ���� �� ���� ���� ���̿� ���� ���� ���̸� ��� �Ͽ���. (���̸� ���)
SELECT * FROM EMPLOYEE;
SELECT TO_DATE(SUBSTR(EMP_NO, 1, 2), 'YYYY') FROM EMPLOYEE;
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) FROM EMPLOYEE;

--���� ����� ������ ���� ������� �����Ѵ�.
--1. �ֹε�Ϲ�ȣ���� ���� ���ڸ� 2���� SUBSTR �Լ��� �̿��� ���´�.
--2. ���� 2�ڸ��� CHARACTER Ÿ���� ���� �տ� ���ͷ��� �̿��� 19�� ���δ�.
--3. ������ CHARACTER Ÿ���� ���ڸ� DATE Ÿ������ ��ȯ�Ѵ�.
--4. DATE Ÿ������ ��ȯ�� �⵵�� ��ǻ�� �ð� ���̿��� ����� ���̰� ������ ���Ѵ�.
--5. ���� ���� 12�� ���� ���� CEIL �Լ��� �ø��� �Ѵ�.
SELECT 
MAX(CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) / 12)) AS "�ִ� ����",
MIN(CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) / 12)) AS "�ּ� ����"
FROM EMPLOYEE;

--11.  ȸ�翡�� �߱��� �ؾ� �Ǵ� �μ��� ��ǥ�Ͽ��� �Ѵ�.
-- �μ��ڵ尡 D5,D6,D9  �߱�, �׿ܴ� �߱پ��� ���� ��µǵ��� �Ͽ���. 
-- ��� ���� �̸�,�μ��ڵ�,�߱����� (�μ��ڵ� ���� �������� ������.)
--   (�μ��ڵ尡 null�� ����� �߱پ��� ��)
SELECT EMP_NAME, DEPT_CODE,
    CASE 
        WHEN DEPT_CODE IN('D5', 'D6', 'D9') THEN '�߱�'
        ELSE '�߱پ���' END AS "�߱� ����"
FROM EMPLOYEE
ORDER BY DEPT_CODE;

--12. ������, �μ��ڵ�, �������, ���� ��ȸ
--   ��, ��������� �ֹι�ȣ���� �����ؼ�, 
--   ������ ������ �����Ϸ� ��µǰ� ��.
--   ���̴� �ֹι�ȣ���� �����ؼ� ��¥�����ͷ� ��ȯ�� ����, �����
--	* �ֹι�ȣ�� �̻��� ������� ���ܽ�Ű�� ���� �ϵ���(200,201,214 �� ����)
--	* HINT : NOT IN ���
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, DEPT_CODE,
    SUBSTR(EMP_NO, 1, 2)||'�� '|| SUBSTR(EMP_NO, 3, 2)||'�� '||
    SUBSTR(EMP_NO, 5, 2)||'��' AS "�������",
    CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||TO_DATE(SUBSTR(EMP_NO, 1, 2), 'YYYY'))) / 12) AS "����"
FROM EMPLOYEE
WHERE EMP_ID NOT IN(200, 201, 214);

--13. �������� �Ի��Ϸ� ���� �⵵�� ������, �� �⵵�� �Ի��ο����� ���Ͻÿ�.
--  �Ʒ��� �⵵�� �Ի��� �ο����� ��ȸ�Ͻÿ�. ���������� ��ü�������� ���Ͻÿ�
--  => to_char, decode, sum ���
--	-------------------------------------------------------------------------
--	 1998��   1999��   2000��   2001��   2002��   2003��   2004��  ��ü������
--	-------------------------------------------------------------------------
SELECT TO_CHAR(HIRE_DATE, 'YYYY') FROM EMPLOYEE ORDER BY 1;
SELECT 
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '1998', 1)), 0) AS "1998��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '1999', 1)), 0) AS "1999��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2000', 1)), 0) AS "2000��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2001', 1)), 0) AS "2001��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2002', 1)), 0) AS "2002��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2003', 1)), 0) AS "2003��",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2004', 1)), 0) AS "2004��",
    COUNT(*) AS "��ü������"
FROM EMPLOYEE;

--14.  �μ��ڵ尡 D5�̸� �ѹ���, D6�̸� ��ȹ��, D9�̸� �����η� ó���Ͻÿ�.
--   ��, �μ��ڵ尡 D5, D6, D9 �� ������ ������ ��ȸ��
--  => case ���  �μ��ڵ� ���� �������� ������.
SELECT EMP_NAME,
    CASE 
        WHEN DEPT_CODE = 'D5' THEN '�ѹ���'
        WHEN DEPT_CODE = 'D6' THEN '��ȹ��'
        WHEN DEPT_CODE = 'D9' THEN '������'
    END AS "�μ�"
FROM EMPLOYEE
WHERE DEPT_CODE IN('D5', 'D6', 'D9') ORDER BY DEPT_CODE;

SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;

SELECT EMP_NAME, DEPT_TITLE FROM EMPLOYEE, DEPARTMENT
WHERE
    DEPT_CODE IN('D5', 'D6', 'D9') AND
    DEPT_CODE = DEPT_ID
ORDER BY DEPT_CODE;
    