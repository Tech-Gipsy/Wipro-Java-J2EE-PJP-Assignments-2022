create table users
(
    userid varchar2(200),
    password varchar2(200),
    name varchar2(200),
    IncorrectAttempts number(2),
    lockstatus number(2),
    usertype varchar2(200)
);
insert into users values('AB1001','AB1001','Hari',0,0,'Admin');
insert into users values('TA1002','TA1002','Prasath',0,0,'Employee');
insert into users values('RS1003','RS1003','Ganesh',0,0,'Employee');