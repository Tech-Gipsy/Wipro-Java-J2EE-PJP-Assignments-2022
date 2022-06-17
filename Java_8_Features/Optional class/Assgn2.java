import java.util.Optional;

public class Assgn2 {
	String address;
	String default_address = "India";

	public static void main(String[] args) {
		Assignment02 obj = new Assignment02();
		Optional<String> n = Optional.ofNullable(obj.address);

		System.out.println(n.orElse(obj.default_address));
	}

}
