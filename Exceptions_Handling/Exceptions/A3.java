// Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
// In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
package Exceptions_Handling.Exceptions;

import java.util.Scanner;


public class A3 {
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String name = null;
            int subA = 0;
            int subB = 0;
            int subC = 0;
            try {
                name = s.nextLine();
                if (s.hasNextInt())
                    subA = s.nextInt();
                else
                    throw new NumberFormatException();
                if (subA < 0) throw new negvalerror();
                if (subA > 100) throw new outofrange();

                if (s.hasNextInt())
                    subB = s.nextInt();
                else
                    throw new NumberFormatException();
                if (subB < 0) throw new negvalerror();
                if (subB > 100) throw new outofrange();

                if (s.hasNextInt())
                    subC = s.nextInt();
                else
                    throw new NumberFormatException();
                if (subC < 0) throw new negvalerror();
                if (subC > 100) throw new outofrange();

            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            }
            catch (negvalerror e) {
                System.out.println(e.getMessage());
                break;
            }
            catch (outofrange e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println("Name: " + name);
            System.out.println("Marks of subject A: " + subA);
            System.out.println("Marks of subject B: " + subB);
            System.out.println("Marks of subject C: " + subC);
        }

    }

}
class negvalerror extends Exception {
    public negvalerror()
    {System.out.println("Negative value exception raised Check input");}
}
class outofrange extends Exception {
    public outofrange()
    {System.out.println("Value out of range  exception raised Check input");}
}