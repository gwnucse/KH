
CREATE TABLE NOTICE(
    NOTICE_NO NUMBER PRIMARY KEY,
    NOTICE_TITLE VARCHAR2(100) NOT NULL,
    NOTICE_WRITER VARCHAR2(20) NOT NULL,
    NOTICE_CONTENT VARCHAR2(4000) NOT NULL,
    NOTICE_DATE DATE DEFAULT SYSDATE,
    FILENAME VARCHAR2(200),
    FILEPATH VARCHAR2(200),
    CONSTRAINT FK_NOTICE_WRITER FOREIGN KEY(NOTICE_WRITER) REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE
);

CREATE SEQUENCE SEQ_NOTICE;

INSERT INTO NOTICE VALUES(SEQ_NOTICE.NEXTVAL, '공지', 'admin', '공지입니다', SYSDATE, NULL, NULL);
SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC;
COMMIT;

SELECT * FROM MEMBER WHERE REGEXP_LIKE(MEMBER_ID, '.*user.*');

SELECT *
FROM(
    SELECT ROWNUM AS RNUM, N.*
    FROM (
        SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC) N
) WHERE RNUM BETWEEN 1 AND 10;
