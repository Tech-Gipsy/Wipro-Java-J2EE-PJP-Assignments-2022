
import java.util.Arrays;
import java.util.Scanner;

public class Assgn2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.next();
		char[] array = str.toCharArray();
		Arrays.parallelSort(array);
		str = new String(array);
		System.out.println(str);
	}

}
