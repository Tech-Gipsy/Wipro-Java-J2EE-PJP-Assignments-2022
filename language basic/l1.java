public class l1 {

    /* "1.  Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below.
        Example:
        If the command line arguments are ABC and Mumbai then the output generated should    be ABC Technologies Mumbai
[Note: It is mandatory to pass two arguments in command line]*/
    public static void main(String[] args)
    {

        int x = args.length;
        if (x != 2) {
            System.out.println("invalid parameters");
        } else {
            System.out.println(args[0] + " Technologies " + args[1]);
        }
    }
}
