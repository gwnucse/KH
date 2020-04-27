
CREATE TABLE MEMBER(
    MEMBER_ID VARCHAR2(20) PRIMARY KEY,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20) NOT NULL,
    AGE NUMBER NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL,
    PHONE VARCHAR2(11) NOT NULL,
    ADDRESS VARCHAR2(100) NOT NULL,
    ENROLL_DATE DATE DEFAULT SYSDATE
);

INSERT INTO MEMBER VALUES('user01', '1234', '����01', 25, 'user01@naver.com', '01012345678', '����', default);
INSERT INTO MEMBER VALUES('user02', '1234', '����02', 22, 'user02@naver.com', '01012521678', '����', default);
INSERT INTO MEMBER VALUES('user03', '1234', '����03', 16, 'user03@naver.com', '01014734712', '�뱸', default);
INSERT INTO MEMBER VALUES('user04', '1234', '����04', 28, 'user04@naver.com', '01034731512', '�λ�', default);
INSERT INTO MEMBER VALUES('user05', '1234', '����05', 31, 'user05@naver.com', '01034745152', '���', default);
INSERT INTO MEMBER VALUES('user06', '1234', '����06', 42, 'user06@naver.com', '01034721512', '����', default);
INSERT INTO MEMBER VALUES('user07', '1234', '����07', 26, 'user07@naver.com', '01012573441', '���ֵ�', default);
INSERT INTO MEMBER VALUES('user08', '1234', '����08', 21, 'user08@naver.com', '01012599912', '��õ', default);
INSERT INTO MEMBER VALUES('user09', '1234', '����09', 51, 'user09@naver.com', '01016734121', '����', default);
INSERT INTO MEMBER VALUES('user10', '1234', '����10', 37, 'user10@naver.com', '01012467821', 'û��', default);

SELECT * FROM MEMBER;
COMMIT;
