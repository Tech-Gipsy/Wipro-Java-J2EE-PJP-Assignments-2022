// A) Write a program to check if a given integer number is Positive, Negative, or Zero. 

// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

//      lastDigit(7, 17) → true
//      lastDigit(6, 17) → false
//      lastDigit(3, 113) → true
public class fcs1 {
    public static void main(String[] args)
    {
        signcheck(args[0]);//1.a
       // lastdigit(56,6); //1.b


    }

  
    public static void signcheck(String a) {
        int x = Integer.parseInt(a);
        if (x > 0) {
            System.out.println("Given number is Positive ");
        } else if (x == 0) {
            System.out.println("Given Number is Zero");
        } else {
            System.out.println("Given Number is Negative");
        }
    }
    public static void lastdigit(int a, int b)
    {
        if((b%10)==(a%10))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}