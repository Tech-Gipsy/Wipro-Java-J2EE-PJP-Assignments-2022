/* Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student.
 */
package sql.preparedStatement_metadata_objects.assgn5;

import java.sql.*;

public class assgn5 {

    static PreparedStatement psts;
    Statement sts;
    static Connection conn;
    static String url="jdbc:oracle:thin:@localhost:1521/orcl";
        public static void main(String[] args)
        {
            if (args.length==1)
            {
                getdata(Integer.parseInt(args[0]));
            }
        }



    private static void getdata(int r) {
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");

            psts=conn.prepareStatement("select * from studentdata where roll_no=?");
            psts.setInt(1,r);
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
