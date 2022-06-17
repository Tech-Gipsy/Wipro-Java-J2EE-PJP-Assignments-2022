/* Modification of Student record 
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated. Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table for that particular student.
 */
package sql.preparedStatement_metadata_objects.assgn4;

import java.sql.*;
import java.util.Scanner;

public class assgn4 {
    static PreparedStatement psts;
    Statement sts;
    static Connection conn;
    static String url="jdbc:oracle:thin:@localhost:1521/orcl";

    public static void main(String[] args) {
        int q = 0;
        getdata();
        if (args.length==2) {
            try {
                conn = DriverManager.getConnection(url, "hr", "hr");
                System.out.println("Connection Established successfully.");

            } catch (SQLException e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
            }
            update(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        }
        else{
            System.out.println("No valid data given");
        }
    }
    static void  update(int r,int f){
        try {

                psts=conn.prepareStatement("update studentdata set fee=? where roll_no=?");
                psts.setInt(1,f);
                psts.setInt(2,r);
                psts.executeUpdate();


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


