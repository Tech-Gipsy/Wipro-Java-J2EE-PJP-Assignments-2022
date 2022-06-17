/* Create a stored procedure that calculates net salary of all the employees whose records are stored in table "emp".
The criteria for calculating net salary is as follows :
Gross salary = sal + comm.
Net Salary = gross salary - IT
If the employee's commission is null then IT is calculated as
IT =  10% of gross salary
else if the employees commission is less than 500, then IT is calculated as
IT =  15% of gross salary
else
IT = 20% of gross salary.
Develop a jdbc program that invokes this stored procedure by passing the empno. and in return gets the net salary of each employee. Display on screen the empno., ename and net salary of all the employees.
 */
package sql.callablestatements;
import java.sql.*;
import static java.lang.Class.forName;
public class Assgn1 {
    static Connection conn;
    static Statement sts;
    public static void main(String[] args)
    {
        database();
        try {
            sts=conn.createStatement();
            ResultSet res=sts.executeQuery("select * from emp");
            while(res.next())
            {
                CallableStatement csts=conn.prepareCall("{call calculate_salary(?,?)}");
                csts.setInt(1,res.getInt("emp_no"));
                csts.registerOutParameter(2, Types.DOUBLE);
                csts.executeQuery();
                double netsalary = csts.getDouble(2);
                System.out.println("empno: " + res.getString("emp_no") + ", ename: " + res.getString("emp_name") + ", net salary: " + netsalary);
            }
            conn.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
    }
    static void database()
    {
        String sqlurl="jdbc:oracle:thin:@localhost:1521:orcl";
        try
        {
            forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");
            System.out.println("Connection Established successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Connection could  not be established");
            System.out.println(e);
        }
    }
    }
