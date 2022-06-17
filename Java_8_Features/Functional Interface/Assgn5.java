
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assgn5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 14, 16, 35, 4, 64, 20, 121, 25, 1));

		Predicate<Integer> p = i -> ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0) ? true : false;
		ArrayList<Integer> res = new ArrayList<>();
		list.forEach(
				i -> {
					if (p.test(i))
						res.add(i);
				});
		System.out.println(res);
	}

}
