// Write a program to reverse a given number and print

// Example1)
// I/P: 1234
// O/P:4321

// Example2)
// I/P:1004
// O/P:4001

import java.util.Scanner;

public class fcs16 {
    public static void main(String[] args)

    {
        Scanner sc= new Scanner(System.in);
        int inp= sc.nextInt();
        while (inp!=0)
        {
            System.out.print(inp%10);
            inp/=10;

        }
    }
}
