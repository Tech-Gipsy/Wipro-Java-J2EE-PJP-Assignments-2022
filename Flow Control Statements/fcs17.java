// Write a Java program to find if the given number is palindrome or not

// Example1)
// C:\&gt;java Sample 110011
// O/P: 110011 is a palindrome

// Example2)
// C:\&gt;java Sample 1234
// O/P: 1234 is not a palindrome
import java.util.Scanner;

public class fcs17 {

    public static void main(String[] args)

    {
        Scanner sc= new Scanner(System.in);
        int inp= sc.nextInt();
        int t=inp;
        int res=0;
        while (inp!=0)
        {

            res=res*10+inp%10;
            inp/=10;

        }
        if(t==res)
            System.out.println(t+ "is a palindrome");
        else
            System.out.println(t+ "is not a palindrome");
    }
}
