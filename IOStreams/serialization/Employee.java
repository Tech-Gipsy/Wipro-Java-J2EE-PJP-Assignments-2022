/*  
Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).

Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.

Create an object of the Employee class and save this object in a file called "data" using serialization.
Later using deserialization read this object and print the properties of this object. */
package IOStreams.serialization;

import java.io.*;
import java.util.Date;

 class Employee implements Serializable {
    private String name;
    private Date dob;
    private String Department;
    private String Designation;
    private double Salary;

    public Employee(String name, Date dob, String department, String designation, double salary) {
        this.name = name;
        this.dob = dob;
        Department = department;
        Designation = designation;
        Salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getDepartment() {
        return Department;
    }

    public String getDesignation() {
        return Designation;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", Department='" + Department + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
class Test
{
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Date dob = new Date(2001, 3, 19);
        System.setProperty("user.dir", "C:\\Users\\Pikachu\\IdeaProjects\\wipro\\src");

        Employee e = new Employee("Jarvis", dob, "gaming", "Developer", 500000);
        System.out.println(e);
        File f1=new File(System.getProperty("user.dir") + "\\IOStreams\\serialization\\"+"data");

        FileOutputStream fos = new FileOutputStream(f1);
        ObjectOutputStream o = new ObjectOutputStream(fos);
        o.writeObject(e);
        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream oi = new ObjectInputStream(fis);
        Employee e2 = (Employee) oi.readObject();
        System.out.println(e2);
        fos.close();
        o.close();
        fis.close();
        oi.close();

    }

}
