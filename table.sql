create TABLE MEMBERS(
userId VARCHAR2(100) PRIMARY KEY,
userPwd VARCHAR(100) NOT NULL,
userName VARCHAR2(100) NOT NULL,
gender VARCHAR2(50) DEFAULT '남',
hobby VARCHAR2(2000),
birth DATE,
age NUMBER,
phone VARCHAR2(15),
address VARCHAR2(2000),
introduce VARCHAR2(2000)
)

create table BOARD (
	BOARD NUMBER PRIMARY KEY,
	USERID VARCHAR2(20) NOT NULL,
	TITLE VARCHAR2(200) NOT NULL,
	CONTENT VARCHAR2(2000) NOT NULL,
	HITCOUNT NUMBER DEFAULT 0,
	REGDATE DATE DEFAULT SYSDATE,
	CONSTRAINT BOARD_FK FOREIGN KEY(USERID)
	REFERENCES MEMBERS(USERID)
)

CREATE SEQUENCE BOARDSEQ

select * from MEMBERS

drop table MEMBERS
drop table BOARD

select userId, userPwd, userName, gender, hobby, birth, age, phone, address, introduce
	from members
	where ( userId = 'first' and userPwd = 'asdasd' )