
import java.time.LocalTime;

public class Assgn6 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Time : " + time);
		System.out.println("Time before 5 hours 30 minutes : " + time.minusMinutes(30).minusHours(5));
	}

}
