
import java.util.ArrayList;

class Student {
	private int rollNo;
	private String name;
	private float mark;

	Student(int rollNo, String name, float mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	float getMark() {
		return mark;
	}
}

public class Assgn3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "Sachin", 85));
		list.add(new Student(102, "Kohli", 80));
		list.add(new Student(103, "Dhoni", 40));
		list.add(new Student(104, "Raina", 95));
		list.add(new Student(105, "Rahul", 49));
		long count = list.stream().filter(s -> s.getMark() >= 50).count();
		System.out.println(count);
	}

}
