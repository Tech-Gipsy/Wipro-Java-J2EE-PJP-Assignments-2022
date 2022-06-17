package mile1.bean.main;

import mile1.bean.Student;
import mile1.bean.exception.NullMarksArrayException;
import mile1.bean.exception.NullNameException;
import mile1.bean.exception.NullStudentObjectException;
import mile1.bean.service.StudentReport;
import mile1.bean.service.StudentService;

public class StudentMain {

    static Student s[] =new Student[10];

    static {

        s[0]=new Student("A1",new int[]{72,73,74});
        s[1]=new Student("B1",new int[]{75,76,77});
        s[2]=new Student("C1",new int[]{99,99,99});
        s[3]=new Student("C3",new int[]{100,100,99});
        s[4] = new Student("B2", new int[] {13, 88, 13});
        s[5] = new Student("C3", new int[] {14, 14, 99});
        s[6] = new Student("A2", new int[] {77, 55, 12});
        s[7] = new Student(null, new int[] {13, 88, 13});
        s[8] = new Student("A2",null);
        s[9] = null;

    }
    public static void main(String[] args)
    {
        StudentReport sr=new StudentReport();
        StudentService ss=new StudentService();
        System.out.println("Grade Calculation:");
        String x=null;
        for (int i = 0; i < s.length; i++)  {
        try {
            x = sr.validate(s[i]);
        } catch (NullNameException e) {
            x = "NullNameException occured at index at"+i;
        } catch (NullMarksArrayException e) {
            x = "NullMarksArrayException occured at index at"+i;
        } catch (NullStudentObjectException e) {
            x = "NullStudentObjectException occured atindex at"+i;
        }

        System.out.println("GRADE = " + x);
    }

        System.out.println("Number of Objects with Marks array as null = " +
                ss.findNumberOfNullMarksArray(s));
        System.out.println("Number of Objects with Name as null = " +
                ss.findNumberOfNullName(s));
        System.out.println("Number of Objects that are entierly null = " +
                ss.findNUmberOfNullObjects(s));


      
    }

}
