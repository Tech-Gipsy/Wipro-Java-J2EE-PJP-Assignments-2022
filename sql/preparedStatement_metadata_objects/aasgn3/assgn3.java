package sql.preparedStatement_metadata_objects.aasgn3;

import javax.xml.transform.Result;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class assgn3 {
    static PreparedStatement psts;
    Statement sts;
    static Connection conn;
    static String url="jdbc:oracle:thin:@localhost:1521/orcl";

    public static void main(String[] args) {
        int q = 0;
        Scanner scan = new Scanner(System.in);
        getdata();
        System.out.println("Enter the Student Rollno to delete data");
        q = Integer.parseInt(scan.nextLine());
        delete(q);
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("Connection Established successfully.");

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
   static void  delete(int q){
        try {
            psts=conn.prepareStatement("select * from studentdata where roll_no=?");
            psts.setInt(1,q);
            ResultSet res=psts.executeQuery();
            while(res.next())
            {
                psts=conn.prepareStatement("insert into studentdatalog values(?,?,?,?,?)");
                psts.setInt(1,res.getInt("roll_no"));
                psts.setString(2,res.getString("student_name"));
                psts.setString(3,res.getString("jdate"));
                psts.setString(4, String.valueOf((java.time.LocalDate.now())));
                psts.setInt(5,res.getInt("fee"));
                psts.executeUpdate();
            }
            psts=conn.prepareStatement("delete studentdata  where roll_no=?");
            psts.setInt(1,q);
            psts.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private static void getdata() {
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");

            psts=conn.prepareStatement("select * from studentdata");
            ResultSet res=psts.executeQuery();
            System.out.println("Roll-No              "+"Student Name         "+"Joining Data        "+"Fee   ");
            while(res.next())
            {
                System.out.println(res.getInt("roll_no")+"                      "+res.getString("Student_name")+"              "+res.getString("jdate")+"        "+res.getInt("fee"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
