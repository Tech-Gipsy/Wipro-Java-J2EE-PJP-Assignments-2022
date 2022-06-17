
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Assgn2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 3, 11, 7, 4, 2, 20, 23, 12, 10));

		Function<ArrayList<Integer>, Integer> func = all -> {
			int sum = 0;
			for (int element : all) {
				sum += element;
			}
			return sum;
		};

		System.out.println(func.apply(list));
	}

}
