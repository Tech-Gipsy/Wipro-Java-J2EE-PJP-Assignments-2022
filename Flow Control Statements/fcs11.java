// Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.
public class fcs11 {
    public static void main(String[] args) {
        int l=23;
        int h=57;
       for(int i = l; i <= h; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
