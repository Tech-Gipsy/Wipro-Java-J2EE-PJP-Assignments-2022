package collections.set;

import sun.text.bidi.BidiLine;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private int empID;
    private String name;
    private float salary;
    Employee(int id,String name,float salary)
    {
        this.empID= id;
        this.name=name;
        this.salary=salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
       @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {

        if(this.salary==o.getSalary())
        {
            return 0;
        }
        else if(this.salary>o.getSalary())
            return 1;
        else
            return -1;

    }

  }
class TreeSetDemo{
    static TreeSet<Employee> t=new TreeSet<Employee>();
    public static void main(String[] args)
    {
        TreeSetDemo.addEmployee((new Employee(34,"alexa",4500)));
        TreeSetDemo.addEmployee(new Employee(36,"jarvis",5500));
        TreeSetDemo.addEmployee(new Employee(1,"Supreme",10000));
        TreeSetDemo.displayAllEmployee();
    }
    static boolean addEmployee(Employee e){
        t.add(e);
        return true;
    }
    static void displayAllEmployee()
    {
        for(Employee e:t)
            System.out.println(e);

    }
}
public class s3 {

}
