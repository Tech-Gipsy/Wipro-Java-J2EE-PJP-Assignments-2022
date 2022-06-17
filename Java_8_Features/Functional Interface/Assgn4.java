
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
}

public class Assgn4 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "alexa", 44, "mars"));
		list.add(new Employee(2, "tesla", 45, "moon"));

		Predicate<Double> p = i -> i < 10000;
		ArrayList<String> res = new ArrayList<>();
		list.forEach(
				i -> {
					if (p.test(i.getSalary()))
						res.add(i.getName());
				});
		System.out.println(res);
	}

}
