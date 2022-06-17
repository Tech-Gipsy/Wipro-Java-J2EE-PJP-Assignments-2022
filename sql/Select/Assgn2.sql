--  Create a query to display the last name, job ID, hire date, and employee ID for each employee, with the employee ID appearing first. Provide an alias STARTDATE for the HIRE_DATE column.

select lname,jobid,EmpId,hdate as STARTDATE from Employee;