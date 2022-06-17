
import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee {
	private int empNo;
	private String name;
	private int age;
	private String location;

	Employee(int empNo, String name, int age, String location) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	String getLocation() {
		return location;
	}

	public String toString() {
		return "Employee No: " + empNo + " name = " + name + " age = " + age + " location = " + location;
	}
}

public class Assgn2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sachin", 35, "Pune"));
		list.add(new Employee(102, "Kohli", 40, "Delhi"));
		list.add(new Employee(103, "Dhoni", 30, "Ranchi"));
		list.add(new Employee(104, "Raina", 25, "Patna"));
		list.add(new Employee(105, "Rahul", 29, "Pune"));

		ArrayList res = (ArrayList) list.stream().filter(e -> e.getLocation().equalsIgnoreCase("Pune"))
				.collect(Collectors.toList());
		res.forEach(emp -> System.out.println(emp));
	}

}
