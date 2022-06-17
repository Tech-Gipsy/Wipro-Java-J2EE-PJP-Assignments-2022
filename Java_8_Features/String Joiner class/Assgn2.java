
import java.util.StringJoiner;

public class Assgn2 {

	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Banglore");
		s1.add("Hyderabad");
		s1.add("pune");
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Mars");
		s2.add("venus");
		s2.add("pluto");

		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}

}
