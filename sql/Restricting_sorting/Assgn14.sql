--  Display the last name, job, and salary for all employees whose jobs are either those of a sales representative or of a stock clerk, and whose salaries are not equal to $2,500, $3,500, or $7,000.
select lname,job,salary from employee
where job='Sales' or job='Stock Clerk'
and salary NOT IN (2500,3500,7000);