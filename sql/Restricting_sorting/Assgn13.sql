--  Display the last names of all employees who have both an āaā and an āeā in their last name.
select lname from employee
where lname like '%a%e%';