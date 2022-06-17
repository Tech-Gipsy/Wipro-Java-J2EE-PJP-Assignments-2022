/*  Create the EMP table based on the following table instance chart. Save the statement in a script called lab_10_03.sql , and then execute the statement in the script to create the table. Confirm that the table is created.
Specification-  Values
Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
Key Type: PK,  -,  -, FK
Nulls /Unique:  -,  Not null,  -,  -,
FK Table:   -,  -,    -, Dept
FK Column:   -,   -,  -,  ID
Data type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
Length: 7, 25, 25, 7

Insert 101,Sam,Sundar,10
Insert 101,Ram,Krishna,20
Insert 102,Gopi,null,40
Insert 103,null,ram,20
 */
create table EMP
(
    ID NUMBER(7) ,
    LAST_NAME VARCHAR2(25) not null,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_pk PRIMARY KEY ( ID ),
    constraint EMP_fk foreign key(DEPT_ID) references Dept(DEPT_ID)
);
insert into EMP values(101,'Sam','Sundar',10);
insert into EMP values(101,'Ram','Krishna',20);
insert into EMP values(102,'Gopi',null,40);