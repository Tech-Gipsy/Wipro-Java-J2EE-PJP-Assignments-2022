/*  Create the DEPT table based on the following table instance chart. Save the statement in a script called lab_10_01.sql , and then execute the statement in the script to create the table. Confirm that the table is created.
Specification Values:
Column named Dept_ID of Numeric 7 size and would be a primary key.
Column named Dept_Name of varchar2 size 20.
 */
create table DEPT
(
    Dept_ID NUMBER(7,0) primary key,
    Dept_name varchar2(20)
)