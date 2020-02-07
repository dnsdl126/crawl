-- 다음 영화 평점을 담기위한 테이블 생성

DROP TABLE tbl_movie;
CREATE TABLE tbl_movie(
    mno VARCHAR2(500) PRIMARY KEY,
    title VARCHAR2(500) NOT NULL,
    content VARCHAR2(2500),
    writer VARCHAR2(200) NOT NULL,
    score NUMBER DEFAULT 0,
    loc VARCHAR2(100),
    regdate NUMBER

);


DROP SEQUENCE seq_movie;

CREATE SEQUENCE seq_movie
    START WITH 1
    INCREMENT BY 1
    NOCYCLE;
