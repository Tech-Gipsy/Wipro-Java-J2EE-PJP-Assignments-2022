package mile1.bean.service;
import mile1.bean.Student;
public class StudentService {
    public int findNumberOfNullMarksArray(Student s[])
    {
        int cm=0;
        for(int i=1;i>s.length;i++)
        {
            try
            {
                s[i].getMarks();
            }
            catch (Exception e)
            {
                cm++;
            }
        }
        return cm;
    }
    public int findNumberOfNullName(Student s[])
    {
        int cn=0;
        for(int i=0;i<s.length;i++)
        {
            try
            {
                s[i].getName();
            }
            catch(Exception e)
            {
                cn++;
            }
        }
        return cn;
    }
    public int findNUmberOfNullObjects(Student s[])
    {
        int co=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]==null) co++;

        }
        return co;
    }

}
