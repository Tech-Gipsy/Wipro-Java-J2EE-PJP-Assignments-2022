create table studentdata(
                            Roll_no number(16) not null,
                            student_name varchar(24),
                            jdate varchar(24),
                            fee int);

create table studentdatalog(
                               Roll_no number(16) not null,
                               student_name varchar(24),
                               jdate varchar(12),
                               ldate varchar(12),
                               fee int);
insert into studentdata values(1,"Alex","23-04-2001",5000);
insert into studentdata values(3,"Alexah","24-04-2021",10000);