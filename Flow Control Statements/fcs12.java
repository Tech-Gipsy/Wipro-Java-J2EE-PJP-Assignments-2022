// Write a program to check if a given number is prime or not.
import java.util.Scanner;

public class fcs12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        int c = 0;
        for (int i = 2; i < inp / 2; i++) {
            if (inp % i == 0) {
                c++;
            } else {
                continue;
            }
        }
        if (c == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is NOT prime");
        }
    }
}
