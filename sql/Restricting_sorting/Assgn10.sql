--  Create a report that displays the last name and salary of employees who earn more than an amount that the user specifies after a prompt. 
-- If you enter 12000, it should display all employees earning more than 12000.
-- Eg: Salary_value: 12000
select lname, salary from employee
where salary>&amount;