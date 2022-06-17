/* Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. Display the columns ename, job, sal and comm. */
package sql.executing_queries;

import java.sql.*;

public class Assgn2 {
    public static void main(String args[]) throws SQLException {
        Statement stmt;
        ResultSet res;
        Connection conn;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
//
        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("Connection Established successfully.");
            stmt = conn.createStatement();
            res = stmt.executeQuery("select ename,job,salary,comm from emp where salary>1000 and salary<2000");
            System.out.printf("%-10S%-10S%10S%10S\n", "ename", "job", "sal", "comm");
            for (int i = 0; i < 40; i++)
                System.out.print("=");
            System.out.println();
            while (res.next()) {

                System.out.printf("%-10s%-10s%10s%10s\n",res.getString("ename"), res.getString("job"), res.getInt("salary"), res.getInt("comm"));
            }
            conn.close();

        }

        catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
