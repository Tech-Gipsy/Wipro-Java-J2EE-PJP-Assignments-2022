package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class s2 {
    public static void main(String[] args)
    {
        TreeSet<String> t=new TreeSet<String>();
        t.add("alexa");
        t.add("jarvis");
        t.add("friday");

        Iterator itr= t.iterator();
        while(itr.hasNext())
        {

            System.out.println(itr.next());
        }
        t= (TreeSet<String>) t.descendingSet();
        itr=t.iterator();
        while(itr.hasNext())
        {

            System.out.println(itr.next());
        }
        System.out.println(t.contains("alexa"));


    }
}
