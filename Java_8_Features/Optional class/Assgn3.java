
import java.util.Optional;

class Employee {
	String empNo;
	String name;
}

class InvalidEmployeeException extends Exception {
	public InvalidEmployeeException(String s) {
		super(s);
	}
}

public class Assgn3 {

	public static void main(String[] args) throws InvalidEmployeeException {
		Employee e = new Employee();
		e = null;
		Optional<Employee> n = Optional.ofNullable(e);

		System.out.println(n.orElseThrow(() -> new InvalidEmployeeException("InvalidEmployeeException has occured")));
	}

}
