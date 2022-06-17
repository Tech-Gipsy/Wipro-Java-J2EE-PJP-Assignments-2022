// Write a program to print the sum of all the digits of a given number.

// Example1) 
// I/P:1234
// O/P:10
import java.util.Scanner;

public class fcs14 {
    public static void main(String[] args)

    {
        Scanner sc= new Scanner(System.in);
        int inp= sc.nextInt();
        int res=0;
        while (inp!=0)
        {
            res+=inp%10;
            inp/=10;

        }
        System.out.println(res);
    }
}
