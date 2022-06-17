--  Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. Order the query in ascending order by the hire date.
select lname,jobid,hdate from employee
where lname='Matos' and lname='Taylor' order by hdate;