
package forEach;

import java.util.ArrayList;
import java.util.Arrays;

public class Assgn1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(
				Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));

		arr.forEach(day -> System.out.println(day));
	}

}
