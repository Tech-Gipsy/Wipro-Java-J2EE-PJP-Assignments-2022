--  List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
-- Employee and Monthly Salary, respectively.
select lname as Employee,salary as "Monthly Salary" from employee
where salary between 5000 and 12000 and DeptId=20 or DeptId=50;