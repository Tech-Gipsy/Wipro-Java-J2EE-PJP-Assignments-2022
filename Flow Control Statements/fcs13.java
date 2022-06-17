//  Write a program to print prime numbers between 10 and 99.
public class fcs13 {

    public void main(String[] args) {
        for (int inp = 10; inp <= 99; inp++) {
            int c = 0;
            for (int i = 2; i < inp / 2; i++) {
                if (inp % i == 0) {
                    c++;
                } else {
                    continue;
                }
            }
            if (c == 0) {
                System.out.println(inp);
            }

        }
    }
}
