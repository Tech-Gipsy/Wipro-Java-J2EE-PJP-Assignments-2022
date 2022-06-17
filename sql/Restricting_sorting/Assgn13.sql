--  Display the last names of all employees who have both an “a” and an “e” in their last name.
select lname from employee
where lname like '%a%e%';