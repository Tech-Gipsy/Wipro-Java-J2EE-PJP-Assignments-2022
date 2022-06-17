// Initialize two character variables in a program and display the characters in alphabetical order.

// Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

// Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
public class fsc4 {
    public static void main(String[] args) {
        char c1 = 's';
        char c2 = 'e';
        if (c1 > c2)
            System.out.println(c2+" , "+c1);
        else
            System.out.println(c1+" , "+c2);
    }
}
