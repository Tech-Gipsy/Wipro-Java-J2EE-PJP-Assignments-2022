
import java.util.ArrayList;
import java.util.function.Function;

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
		return "Employee No: " + empNo + " name=" + name + " age=" + age + " location=" + location;
	}

}

public class Assgn1 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "alexa", 44, "mars"));
		list.add(new Employee(2, "tesla", 45, "moon"));

		Function<ArrayList<Employee>, ArrayList<String>> func = (all) -> {
			ArrayList<String> locations = new ArrayList<>();
			for (Employee e : all) {
				locations.add(e.getLocation());
			}
			return locations;
		};

		System.out.println(func.apply(list));
	}

}
