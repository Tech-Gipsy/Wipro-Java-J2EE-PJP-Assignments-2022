
package forEach;

import java.util.ArrayList;

class Employee {
	int id;
	double salary;
	String address, name;

	Employee(int id, double salary, String name, String address) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
}

public class Assgn2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, 141.0, "aexa", "roaster");
		Employee emp2 = new Employee(2, 342.0, "sdafasd", "tesla");

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(emp1);
		l.add(emp2);

		l.forEach(emp -> System.out.println(
				"ID : " + emp.id + " Name : " + emp.name + " Salary : " + emp.salary + " Address : " + emp.address));
	}

}
