
import java.time.LocalDate;

public class Assgn1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Todays Date : " + date);
		System.out.println("Date after 10 days : " + date.plusDays(10));
	}

}
