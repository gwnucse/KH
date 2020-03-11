
CREATE TABLE DEPT_COPY
AS
SELECT * FROM DEPARTMENT;

SELECT * FROM DEPT_COPY;

--컬럼 추가
ALTER TABLE DEPT_COPY
ADD (KNAME VARCHAR2(20));

ALTER TABLE DEPT_COPY
ADD (HNAME VARCHAR2(20) DEFAULT 'kh');

--컬럼 수정
ALTER TABLE DEPT_COPY
MODIFY DEPT_ID CHAR(3)
MODIFY DEPT_TITLE VARCHAR2(40);

--제약조건 확인
SELECT 
    UC.CONSTRAINT_NAME, -- 제약조건 이름
    UC.CONSTRAINT_TYPE, -- 제약조건 타입
    UC.TABLE_NAME,      -- 테이블 이름
    UCC.COLUMN_NAME,    -- 컬럼 이름
    UC.SEARCH_CONDITION -- 제약조건 설명
FROM USER_CONSTRAINTS UC
JOIN USER_CONS_COLUMNS UCC
ON (UC.CONSTRAINT_NAME = UCC.CONSTRAINT_NAME)
WHERE UC.TABLE_NAME = 'DEPT_COPY';  -- 테이블명은 반드시 대문자

--제약조건 추가
ALTER TABLE DEPT_COPY
ADD CONSTRAINT DCOPY_ID_PK PRIMARY KEY(DEPT_ID)
ADD CONSTRAINT DCOPY_TITLE_UNQ UNIQUE(DEPT_TITLE)
MODIFY HNAME CONSTRAINT DCOPY_HNAME_NN NOT NULL;

--컬럼 삭제
ALTER TABLE DEPT_COPY
DROP COLUMN KNAME;

--제약조건 삭제
ALTER TABLE DEPT_COPY
DROP CONSTRAINT DCOPY_ID_PK
DROP CONSTRAINT DCOPY_TITLE_UNQ
MODIFY HNAME NULL;

--컬럼 이름 변경
ALTER TABLE DEPT_COPY
RENAME COLUMN HNAME TO KHNAME;

SELECT * FROM DEPT_COPY;

--제약조건 이름 변경
ALTER TABLE DEPT_COPY
RENAME CONSTRAINT SYS_C007059 TO DCOPY_ID_NN;

--테이블 이름 변경
ALTER TABLE DEPT_COPY
RENAME TO ALTER_TEST;

SELECT * FROM ALTER_TEST;

--테이블 삭제
DROP TABLE ALTER_TEST;

CREATE TABLE EMP_01(
    EMP_ID NUMBER,
    EMP_NAME VARCHAR2(30),
    DEPT_TITLE VARCHAR2(20)
);

--서브쿼리를 이용한 INSERT
INSERT INTO EMP_01(
    SELECT EMP_ID, EMP_NAME, DEPT_TITLE
    FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
);

SELECT * FROM EMP_01;

--서브쿼리를 이용하여 두개 테이블에 동시 INSERT
CREATE TABLE EMP_02
AS 
SELECT EMP_ID, EMP_NAME, DEPT_CODE
FROM EMPLOYEE WHERE 1=0;

CREATE TABLE EMP_03
AS 
SELECT EMP_ID, EMP_NAME, JOB_CODE
FROM EMPLOYEE WHERE 1=0;
