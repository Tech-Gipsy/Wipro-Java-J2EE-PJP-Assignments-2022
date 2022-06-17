 /*  In the just concluded exercise, where you have established the connection successfully, exclude the registration process(by commenting the line containing the code Class.forName(“..”)). Observe the result. */
package sql.establishing_connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class Assgn2 {
    public static void main(String[] args) throws ClassNotFoundException {



        String sqlurl="jdbc:oracle:thin:@localhost:1521:orcl";
        try{
            Connection conn = DriverManager.getConnection(sqlurl,"bunu", "bunu");
            System.out.println("Connection Established successfully.");
        }
        catch(Exception e){
            System.out.println("Connection could  not be established");
            System.out.println(e);
        }

    }
}
