// Write a program to store integer numbers into Vector collection and use Enumeration to print the values. Also try using Iterator and ListIterator to print the values from the Vector object.
package collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class employee {
    private int id;
    private String name;
    private String designation;
    private int salary;
    public employee(int id, String n, String d, int salary) {
        this.id = id;
        this.name = n;
        this.designation = d;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary;
    }
}
public class L3 {
    public static void main(String[] args) {
        Vector<employee> list = new Vector<>();
        list.add(new employee(101, "bunu", "CEO", 20000));
        list.add(new employee(102, "jarvis", "CTO", 2000));
        list.add(new employee(103, "Alexa", "analyst", 200000));
        list.add(new employee(104, "google", "programmer", 2000));
        Enumeration e= list.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
