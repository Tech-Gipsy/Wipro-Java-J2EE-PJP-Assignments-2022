--  Display the last name and department ID of all employees in departments 20 or 50 in ascending alphabetical order by name.
select lname,DeptId from employee 
where DeptId = 20 or DeptId = 50 order by lname;