package mile1.bean.test;

import mile1.bean.Student;
import mile1.bean.exception.NullMarksArrayException;
import mile1.bean.exception.NullNameException;
import mile1.bean.exception.NullStudentObjectException;
import mile1.bean.service.StudentReport;
import mile1.bean.service.StudentService;
import org.junit.Test;

import static org.junit.Assert.*;

public class testing {
    static Student s[] =new Student[10];
    StudentReport sr=new StudentReport();
    StudentService ss=new StudentService();
    static {

        s[0]=new Student("A1",new int[]{100,90,74});
        s[1]=new Student("B1",new int[]{35,40,41});
        s[2]=new Student("C1",new int[]{30,99,99});
        s[3]=null;
        s[4] = new Student(null, new int[] {13, 88, 13});
        s[5] = new Student("C3",null);
        s[6] = new Student("A2", new int[] {77, 55, 12});
        s[7] = new Student(null, null);
        s[8] = new Student("A2",null);
        s[9] = null;


    }
    //TC1
    @Test
    public void Tc1()
    {
        assertEquals("A",sr.findGrades(s[0]));
    }
    @Test
    public void Tc2()
    {
        assertEquals("D",sr.findGrades(s[1]));
    }
    @Test
    public void Tc3()
    {
        assertEquals("F",sr.findGrades(s[2]));
    }
    @Test(expected =NullStudentObjectException.class)
    public void Tc4() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
        String x = sr.validate(s[3]);
    }
    @Test(expected =NullNameException.class)
    public void Tc5() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
        String x = sr.validate(s[4]);
    }
    @Test(expected =NullMarksArrayException.class)
    public void Tc6() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
        String x = sr.validate(s[5]);
    }

    @Test
    public void Tc7()
    {
        assertEquals(2,ss.findNumberOfNullName(s));
    }
    @Test
    public void Tc8()
    {
        assertEquals(2,ss.findNUmberOfNullObjects(s));
    }
    @Test
    public void Tc9()
    {
        assertEquals(2,ss.findNumberOfNullMarksArray(s));
    }


}
