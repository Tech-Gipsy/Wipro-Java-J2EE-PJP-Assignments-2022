
import java.util.ArrayList;
import java.util.Arrays;

public class Assgn3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby"));

		al.forEach(word -> System.out.print((word.length() % 2 != 0) ? word + " " : ""));
	}

}
