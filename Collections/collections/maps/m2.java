/* to store name (as Key) and phone number (as Value). The program should have the following abilities:
a) Provide contact name and get the phone number.
b) Provide phone number and get the contact name.
c) Print all the contact names and their respective phone numbers and observe the output. */
package collections.maps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class contactList
{
    private TreeMap<String , Integer> m=new TreeMap<>();
     void setContact(String name,int no)
    {
        m.put(name,no);
    }
    public String getContactName(int n)
    {
        Set s=m.keySet();
        Iterator itr=s.iterator();

        while (itr.hasNext())
        {
            String s1=(String) itr.next();
            if((int) (m.get(s1))==n)
            {
                return  s1;
            }
        }
        return "Not Found";
    }
    public int getPhoneNumber(String n)
    {
        try {
            return (int) m.get(n);
        }
        catch (NullPointerException e)
        {
            return 0;
        }
    }

}
public class m2 {
    public static void main(String[] args) {
        contactList c = new contactList();
        c.setContact("alex", 9131414);
        c.setContact("BIll",13525235);
        c.setContact("sdf",124212);
        System.out.println(c.getContactName(9131414));
        System.out.println(c.getContactName(35235));
        System.out.println(c.getPhoneNumber("alex"));
        int x=c.getPhoneNumber("adsf");
        if(x!=0)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println("Not Found");
        }



    }

}
