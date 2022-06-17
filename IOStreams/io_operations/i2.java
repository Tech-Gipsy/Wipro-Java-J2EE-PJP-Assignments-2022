/* Write a program to copy contents from one file to another and check the output.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied. */
package IOStreams.io_operations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class i2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.setProperty("user.dir", "C:\\Users\\Pikachu\\IdeaProjects\\wipro\\src");
        System.out.println(System.getProperty("user.dir"));
        System.out.println("Enter the input file name");
        String filename1 =System.getProperty("user.dir") + "\\IOStreams\\io_operations\\" + s.nextLine();
        System.out.println("Enter the output file name");
        String filename2 =System.getProperty("user.dir") + "\\IOStreams\\io_operations\\" + s.nextLine();
        File f1=new File(filename1);
        File f2=new File(filename2);
        /*if(f1.exists()==true && f2.exists()==true)
        {*/
            FileReader fr=new FileReader(f1);
            FileWriter fw=new FileWriter(f2);
            int c;
            while((c=fr.read())!=-1)
            {
                fw.write(c);
            }
            System.out.println("Files copied");
            fr.close();
            fw.close();
       /* }
        else
        {
            System.out.println("Files not found");
        }*/



    }
}
