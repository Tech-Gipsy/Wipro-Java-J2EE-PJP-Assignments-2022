--  Create a report to display the last name and job title of all employees who do not have a manager.
select lname,jobid from employee
where managerid is null;
