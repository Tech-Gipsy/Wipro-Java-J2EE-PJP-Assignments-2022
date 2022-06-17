
interface DigitReference {
	int countDigit(int n);
}

public class Assgn2 {

	static int digitCount(int n) {
		return (int) Math.log10(n) + 1;
	}

	public static void main(String[] args) {
		DigitReference ref = Assignment02::digitCount;
		System.out.println(ref.countDigit(5342));
		System.out.println(ref.countDigit(32));
	}

}
