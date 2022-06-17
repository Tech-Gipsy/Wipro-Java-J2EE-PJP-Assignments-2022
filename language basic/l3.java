public class l3 {


    /*    3. Write a Program to accept two integers through the command line argument and print the sum of the two numbers
    Example:
    C:\>java Sample 10 20
    O/P Expected: The sum of 10 and 20 is 30
    */

    public static void main(String[] args) {
        if (args.length == 2 ) {
            System.out.println("The sum of " + args[0] + " and " + args[1] + " is " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
//            System.out.println("The sum of " + args[0] + " and " + args[1] + " is " + (args[0] +args[1]));
        }
        else
        {
            System.out.println("invalid number of operands");
        }
    }
}
