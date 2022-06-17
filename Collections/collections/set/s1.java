package collections.set;

import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo
{
    HashSet h= new HashSet<>();

    public HashSet addcountry(String countryname)
    {
        h.add(countryname);
        return h;
    }

    public String findcountry(String countryname)
    {
        Iterator itr= h.iterator();
        while(itr.hasNext())
        {
            if(itr.next().equals(countryname))
                return countryname;
        }
        return "Country Not Found";
    }
    public void printAllCountries()
    {
        Iterator itr= h.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
public class s1 {
public static void main(String[] args) {
    HashSetDemo hh = new HashSetDemo();
    hh.addcountry("India");
    hh.addcountry("Mars");
    hh.addcountry("Mars");
    System.out.println("venus "+hh.findcountry("venus"));
    System.out.println("India "+hh.findcountry("India"));
    hh.printAllCountries();
}
}
