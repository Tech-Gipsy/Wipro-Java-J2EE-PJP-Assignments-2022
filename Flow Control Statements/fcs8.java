// Write a program to receive a color code from the user (an Alphabhet). 

// The program should then print the color name, based on the color code given. 

// The following are the color codes and their corresponding color names.
// R-&gt;Red, B-&gt;Blue, G-&gt;Green, O-&gt;Orange, Y-&gt;Yellow, W-&gt;White. 

// If color code provided by the user is not valid then print "Invalid Code". 
import java.util.Scanner;

public class fcs8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char color = scan.next().charAt(0);
        switch (color) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;

            case 'B':
            case 'b':
                System.out.println("Blue");
                break;

            case 'G':
            case 'g':
                System.out.println("Green");
                break;

            case 'O':
            case 'o':
                System.out.println("Orange");
                break;

            case 'Y':
            case 'y':
                System.out.println("Yellow");
                break;

            case 'W':
            case 'w':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid Code");
        }
    }
}
