
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assgn7 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(24, 10, 25, 47, 39, 20, 7, 48, 63, 51));

		Consumer<ArrayList<Integer>> c = num -> num.forEach(
				i -> System.out.println(i + (i % 2 == 0 ? " even" : " odd")));

		c.accept(list);
	}

}
