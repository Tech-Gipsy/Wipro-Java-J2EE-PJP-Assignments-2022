
interface PrimeReference {
	void checkPrime(int n);
}

public class Assgn3 {

	Assignment03(int n) {
		int flag = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	public static void main(String[] args) {
		PrimeReference ref = Assignment03::new;
		ref.checkPrime(8);
		ref.checkPrime(23);
	}

}
