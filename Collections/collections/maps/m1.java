// 1. Develop a java class with an instance variable mapObj  of type HashMap. Create a method 
// String saveCountryCapital(String countryName, String capital) : The method should add the passed country and capital as key/value in the mapObj and return the appropriate value, try adding duplicate country name and capital.
// Key- Country                          Value - Capital
// India                                                      Delhi
// Japan                                                    Tokyo
// 2. Develop a method String getCapital(String countryName) which returns the capital for the country passed. If country is not available, then return "No Country Found"
// 3. Develop a method String getCountry(String capitalName) which returns the country for the capital name. If capital is not available, then return "No Capital Found"
// 4. Develop a method which iterates through the mapObj and creates another HashMap mapObj2 with Capital as the key and value as Country and returns the mapObj2 object.
// Key – Capital                    Value – Country
// Delhi                                                  India
// Tokyo                                                Japan
// 5. Develop a method which returns ArrayList object, the ArrayList object should contain all country names present in mapObj.
// 6. Develop a method which returns ArrayList object, the ArrayList object should contain all capital names present in mapObj.
// NOTE: You can test the methods using a main method.
package collections.maps;

import java.util.*;

 class mobj {
    private static Map m1=new HashMap();
    void setmobj(String cname, String cap)
    {
        m1.put(cname,cap);
    }
    String saveCountryCapital(String cname,String cap)
    {
        m1.put(cname,cap);
        return m1.toString();
    }
    public static String getCapital(String cname) {

        if (m1.containsKey(cname)) {
                return (String) m1.get(cname);
            }
            return "No Country Found";
    }

    static String getCountry(String cap)
    {
        Set s=m1.keySet();
        Iterator itr=s.iterator();

        while (itr.hasNext())
        {
            String s1=(String) itr.next();
            if(m1.get(s1)==cap)
            {
                return  s1;
            }
        }
        return "No Capital Found";
    }
    static Map<String,String> getmapobj()
    {
        Map m2=new HashMap();

        Set ss=m1.keySet();
        Iterator itr=ss.iterator();
        while (itr.hasNext())
        {
            String s3=(String) itr.next();
            m2.put(m1.get(s3),s3);
        }


        return m2;
    }
    static ArrayList getcountrynames()
    {
        ArrayList<String> a = new ArrayList<>();
        Iterator itr=m1.keySet().iterator();
        while(itr.hasNext())
            a.add((String) itr.next());
        return a;
    }
    static ArrayList getcapitalnames()
    {
        ArrayList<String> a = new ArrayList<>();
        Set ss=m1.keySet();
        Iterator itr=ss.iterator();
        while (itr.hasNext())
        {

            a.add((String) m1.get(itr.next()));
        }

        return a;
    }

}

public class m1
{
    public static void main(String[] args)
    {
        mobj m=new mobj();
        m.setmobj("India","Delhi");
        m.setmobj("Japan","Tokyo");
       System.out.println( mobj.getCapital("India"));
       System.out.println( mobj.getCountry("Delhi"));
        System.out.println(mobj.getmapobj());
        System.out.println(mobj.getcapitalnames());
       System.out.println(mobj.getcountrynames());



    }
}
