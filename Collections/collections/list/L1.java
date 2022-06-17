// Create an ArrayList that can store only Strings. 
// Create a printAll method that will print all the elements of the ArrayList using an Iterator and obeserve the order of the values being printed.
package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class L1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        printAll(list);
    }
    public static void printAll(ArrayList<String> a)
    {
        Iterator itr = a.iterator();
        while(itr.hasNext())
        {
            Object e= itr.next();
            System.out.println(e+" ");
        }

    }

}
