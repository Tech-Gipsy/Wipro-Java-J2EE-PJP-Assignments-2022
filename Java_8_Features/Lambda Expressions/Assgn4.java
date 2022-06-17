
interface WordCount {
	int count(String str);
}

public class Assgn4 {

	public static void main(String[] args) {
		WordCount wc = str -> {
			return (str.split(" ").length);
		};
		System.out.println(wc.count("This is a test"));
	}

}
