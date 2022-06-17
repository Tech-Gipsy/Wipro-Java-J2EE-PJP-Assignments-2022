CREATE OR REPLACE PROCEDURE calculate_salary (
	p_empno IN emp.emp_no % type ,
	output OUT emp.salary % type
)
IS
	p_comm emp.commission % type;
	p_sal emp.salary % type;
	gross_salary  emp.salary % type;
	net_salary  emp.salary % type;
	it  emp.salary % type;
BEGIN
SELECT commission INTO p_comm FROM emp WHERE emp_no = p_empno;
SELECT salary INTO p_sal FROM emp WHERE emp_no = p_empno;
IF p_comm IS NULL THEN
		p_comm := 0;
END IF;
	gross_salary := p_sal + p_comm;
	IF p_comm IS NULL THEN
		it := gross_salary * 10 / 100;
ELSE
		IF p_comm < 500 THEN
			it := gross_salary * 15 / 100;
ELSE
			it := gross_salary * 20 / 100;
END IF;
END IF;
	net_salary := gross_salary - it;
output := net_salary;
END calculate_salary;
/