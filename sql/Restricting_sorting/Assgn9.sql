--  Create a report to display the last name, salary, and commission of all employees who earn commissions. 
-- Sort data in descending order based on salary and commissions. Use the column’s numeric position in the ORDER BY clause.
select lname, salary, commission from employee 
where commission is not null order by 2,3 DESC;