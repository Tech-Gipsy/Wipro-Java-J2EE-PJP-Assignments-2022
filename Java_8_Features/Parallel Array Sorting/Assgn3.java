
import java.util.Arrays;

public class Assgn3 {

	public static void main(String[] args) {
		int array[] = { 3, 10, 2, 8, 6, 23, 15, 9, 18, 7 };
		System.out.print("Before sorting: " + Arrays.toString(array));
		Arrays.parallelSort(array, 0, 5);
		System.out.print("\nAfter sorting: " + Arrays.toString(array));
	}

}
