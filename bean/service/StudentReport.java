package mile1.bean.service;

import mile1.bean.Student;
import mile1.bean.exception.*;
public class StudentReport {
    public String findGrades(Student studentObject)
    {
        String grade;
        int[] marks=studentObject.getMarks();
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            if (marks[i] < 35) {
                return "F";
            } else {
                sum += marks[i];
            }
        }
        if(sum<=150)
            return "C";
        else if(sum>150 && sum<=200)
            return "B";
        else if(sum>200 && sum<=250)
            return "A";
        else {
            return "A+";
        }
    }
    public String validate (Student studentObject)
            throws NullStudentObjectException, NullNameException, NullMarksArrayException	{
        if (studentObject == null) {
            throw new NullStudentObjectException();
        } else {
            if (studentObject.getName() == null) throw new NullNameException();
            if (studentObject.getMarks() == null) throw new NullMarksArrayException();
            return findGrades(studentObject);
        }
    }
}
