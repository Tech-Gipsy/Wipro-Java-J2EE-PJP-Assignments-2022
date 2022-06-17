public class A13 {
        /*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers
Example2)
C:\>java Sample 1 2 3 4
O/P:
 The given array is :
  1 2
  3 4
 The reverse of the array is :
  4 3
  2 1*/
    public static void main(String[] args)
    {
        if(args.length==4)
        {
            System.out.println("The given array is");
            for(int i=0;i<= args.length/2;i+=2)
            {
                System.out.println(args[i] +" "+args[i+1]);
            }
            System.out.println("The reverse of the  array is");
            for(int i= args.length/2+1;i>=0;i-=2)
            {
                System.out.println(args[i] +" "+args[i-1]);
            }
        }
        else
        {
            System.out.println("Please enter 4 integer numbers only");
        }
    }
}
