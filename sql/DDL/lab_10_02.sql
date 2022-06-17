/*  Populate the DEPT table with data from the DEPARTMENTS table. Include only columns that you need.
Insert dept Id 10 and Name Accounts
Insert dept Id as null and Name as TT
Correct by giving 20 and TT
Insert A1 as Id and Accounts
Correct by giving 30 and Accounts
 */
insert into DEPT values(10,'Accounts');
insert into DEPT values(null,'TT');
update DEPT
set Dept_ID=20
where Dept_name='TT';
insert into Dept values(1,'Accounts');
update DEPT
set Dept_ID=30
where Dept_ID=1;
