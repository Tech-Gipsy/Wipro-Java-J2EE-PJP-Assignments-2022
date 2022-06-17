// Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

// public abstract String notice();

// Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

// Create a class TestCompartment.Write main function to do the following:
// Declare an array of Compartment of size 10.
// Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
// Check the polymorphic behavior of the notice method.
// [i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
package Exceptions_Handling.Abstract;

import java.util.Random;

public class a1 {
}
abstract class compartment
{
    public abstract String notice();
}
class firstclass extends compartment
{
    @Override
    public String notice()
    {
        return "First Class";
    }
}
class ladies extends compartment
{@Override

public String notice()
{
    return "Ladies Class";
}

}
class general extends compartment
{
    @Override
    public String notice()
{
    return "General Class";
}
}
class luggage extends compartment
{@Override
    public String notice()
{
    return "Luggage Class";
}
}

class TestCompartment
{
public static void main(String[] args)
{
    compartment[] a=new compartment[10];
    Random r=new Random();
    for(int i=0;i<10;i++)
    {
        int x=r.nextInt((4-1)+1)+1;
        System.out.println(x);
        switch(x)
        {
            case 1:
                a[i]=new luggage();
                break;
            case 2:
                a[i]=new ladies();
                break;
            case 3:
                a[i]=new general();
                break;
            default:
                a[i]=new firstclass();
                break;
        }
        System.out.println(a[i].notice());
    }

}
}