
import java.time.LocalDate;

public class Assgn4 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		if (date.isLeapYear())
			System.out.println("Current Year is a leap year");
		else
			System.out.println("Current Year is not a leap year");
	}

}
