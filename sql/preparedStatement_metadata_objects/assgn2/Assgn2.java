package sql.preparedStatement_metadata_objects.assgn2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assgn2 {
    static Statement sts;
    static Connection conn;
    static ResultSet res;
    static PreparedStatement psts;
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        database.init();
        student s=new student();

        s.setRollno();
        s.setName();
        s.setStandard();
        s.setDob();
        s.setFees();
        try {
            psts=conn.prepareStatement("insert into students values(?,?,?,?,?)");
            psts.setInt(1,s.getRollno());
            psts.setString(2,s.getName());
            psts.setString(3,s.getStandard());
            psts.setString(4,s.getDob());
            psts.setDouble(5,s.getFees());
            psts.executeUpdate();
            System.out.println("Student Data Successfully Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
class student extends Assgn2
{
    int rollno=0;
    String name;
    String Standard;
    String dob;
    double fees;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getStandard() {
        return Standard;
    }

    public String getDob() {
        return dob;
    }

    public double getFees() {
        return fees;
    }

    public void setRollno() {
        int rn=0;
        do {
            System.out.print("Enter rollno: ");
            String s = scan.nextLine();
            rn=Integer.parseInt(s);
                if (String.valueOf(rn).length() == 4) this.rollno = rn;
                else
                    System.out.println("Invalid ROll no Try again");

        } while (this.rollno == 0);

    }


    public void setName() {
        String studentName = "";
        boolean lcfound;
        do {
            System.out.print("Enter name: ");
            this.name = scan.nextLine();

            lcfound = false;
            for (int i = 0; i < name.length(); i++) {
                if (Character.isLowerCase(name.charAt(i))) {
                    lcfound = true;
                    System.out.println("Name Should In CAPITALS Try again");
                    break;
                }
            }
        } while (name.length() > 20 || lcfound);

    }

    public void setStandard() {
        String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
        List<String> list = new ArrayList<>(Arrays.asList(standards));

        String s;
        do {
            System.out.print("Enter standard: ");
            s = scan.nextLine();
            if (list.contains(s))
                this.Standard = s;
            else
                System.out.println("Standard invalid Try again");

        } while (!list.contains(s));

    }
    public void setDob() {
        System.out.printf("Enter DOB(FORMAT DD-mmm-yyyy):");
        this.dob = scan.nextLine();
    }

    public void setFees() {
        System.out.printf("Enter Fees:");
        this.fees = scan.nextDouble();
    }
}
class database extends Assgn2{
    static void init()
    {
        String url="jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            conn = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

    }
}
