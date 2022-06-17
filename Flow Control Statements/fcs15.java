// Write a program to print * in Floyds format (using for and while loop)
// *
// *  *
// *  *   *

// Example1)
// C:\&gt;java Sample 
// O/P: Please enter an integer number

// Example2)
// C:\&gt;java Sample 3
// O/P :
// *
// *  * 
// *  *  *
public class fcs15 {
    public static void main(String[] args)
    {
        int i=Integer.parseInt(args[0]);
        for(int j=0;j<=i;j++)
        {
            for(int k=0;k<j;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
