--  Create a query to increase salary by 10% for all employees in dept 90.
update MY_EMPLOYEE
set salary =salary+(salary*0.1) 
where department_id=90;