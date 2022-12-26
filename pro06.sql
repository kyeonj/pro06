create table sample (id varchar2(10), pw varchar2(50), vcnt int default 0); 
drop table sample;

select * from sample;
insert into sample values('abc','123',0);
insert into sample values('bcd','234',0);
insert into sample values('cde','345',0);
insert into sample values('def','456',0);

create table user1(idm int ,
  id varchar(15) primary key, pw varchar(300),
  name varchar(30), email varchar(40),
  regdate date );
  
 create table user1(idm int GENERATED ALWAYS as identity,
  id varchar(15) primary key, pw varchar(300),
  name varchar(30), email varchar(40),
  regdate date default current_date);
  
  insert into user1 values(1,'kyj', '1234', '김연정', 'kyj@naver.com', SYSDATE);
  select * from user1;
  drop table user1;
  commit;
  
  -- 공지사항 테이블 생성
create table boarda(idx int primary key ,
  subject varchar(100) not null,
  content varchar(500) not null,
  writer varchar(20) not null,
  resdate date );
  insert into boarda values (1, '제목1','예시글 1입니다.','관리자',sysdate);
  
  select * from boarda;