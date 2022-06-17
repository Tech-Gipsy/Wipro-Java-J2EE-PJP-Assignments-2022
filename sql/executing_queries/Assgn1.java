/* Write a java program that connects to oracle database, queries the inbuilt table “emp” and displays the first two columns (empno using column index and ename using column name ) of all the rows. */
package sql.executing_queries;

import java.sql.*;

public class Assgn1 {

    public static void main(String args[]) throws SQLException {
        Statement stmt;
        ResultSet res;
        Connection conn;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

        try{
            conn = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");

            stmt = conn.createStatement();
            res = stmt.executeQuery("Select empno,ename from emp");

            while(res.next()){
                System.out.println(res.getInt(1) + "\t" + res.getString("ename"));
            }
            conn.close();
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
