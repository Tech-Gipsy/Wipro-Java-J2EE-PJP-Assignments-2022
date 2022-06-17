
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Assgn1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Java", "is", "OOP", "Language"));
		StringJoiner sj = new StringJoiner(",", "{", "}");
		list.forEach(element -> sj.add(element));
		System.out.println(sj);
	}

}
