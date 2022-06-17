/* Write a java program that establishes a connection to oracle database successfully. If the connection is successful, it should display a message “Connection Established successfully”. In case, it is not able to do so due to any exception, it should display the message “Connection could  not be established “. If there is an exception, it should also display the description of the exception. */
package sql.establishing_connections;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class Assgn1 {
    public static void main(String[] args) throws ClassNotFoundException {


        try {
            forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
            System.exit(1);
        }
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
