/* Write a program to count the number of times a character appears in a File. 

[Note :  The character check is case insensitive... i.e, 'a' and 'A' are considered to be the same]

Sample Input and Output:
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 99 instances of letter 'r'.
 */
package IOStreams.io_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class i1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.setProperty("user.dir","C:\\Users\\Pikachu\\IdeaProjects\\wipro\\src");
        System.out.println(System.getProperty("user.dir"));
        System.out.println("Enter the file name");
        String filename = s.nextLine();
        System.out.println("Enter the character to be counted");
        char r = s.nextLine().charAt(0);
//        C:\Users\Pikachu\IdeaProjects\wipro\src\IOStreams\io_operations\input.txt
        File f = new File(System.getProperty("user.dir") + "\\IOStreams\\io_operations\\" + filename);
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(f));
        int ch;
        do {
            ch = br.read();

            if (ch >= 65 && ch <= 90) ch += 32;
            if (r >= 65 && r <= 90) r += 32;

            if (ch == r)
                count++;
        } while (ch != -1);

        System.out.println("File '" + filename + "' has " +
                count + " instances of letter '" + r + "'.");

        br.close();
    }
}
