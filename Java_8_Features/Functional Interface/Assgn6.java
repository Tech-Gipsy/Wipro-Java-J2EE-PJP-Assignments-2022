
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assgn6 {

	static String revString(String str) {
		StringBuffer sbr = new StringBuffer();
		sbr.append(str);
		return sbr.reverse().toString();
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList(
				"Shubham", "Tejas", "Shreya", "Vicky", "Amit", "Rakesh", "Ajay", "Vijay", "Amay", "Pooja"));
		ArrayList<String> revWords = new ArrayList<>();
		Consumer<String> rev = str -> revWords.add(revString(str));
		words.forEach(str -> rev.accept(str));
		words = revWords;
		words.forEach(System.out::println);
	}

}
