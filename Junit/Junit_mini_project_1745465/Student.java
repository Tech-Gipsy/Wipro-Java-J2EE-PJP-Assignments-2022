package mile1.bean;

public class Student {
    String name;
    int marks[];
    String grade;
    public Student()
    {}

    public Student(String n,int[] m){
        super();
        this.name=n;
        this.marks=m;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
