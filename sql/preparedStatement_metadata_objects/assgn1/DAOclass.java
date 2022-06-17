package sql.preparedStatement_metadata_objects.assgn1;

import java.sql.*;

public class DAOclass {

    private Statement sts;
    private Connection conn;
    private ResultSet res;
    PreparedStatement psts = null;
    DAOclass() throws SQLException {
        drivertest();
        String url="jdbc:oracle:thin:@localhost:1521/orcl";
        conn = DriverManager.getConnection(url,"hr", "hr");
        System.out.println("Connection Established successfully.");


    }
    public void insert(String[] data) {
        try {
            psts=conn.prepareStatement("insert into studentdata values(?,?,?,?,?)");

        psts.setInt(1, Integer.parseInt(data[1]));
        psts.setString(2, data[2]);
        psts.setString(3, data[3]);
        psts.setString(4, data[4]);
        psts.setInt(5, Integer.parseInt(data[5]));
        psts.executeUpdate();
        System.out.println("Data Insertion successfull");
        } catch (SQLException e) {
            System.out.println("Data Insertion unsuccessfull");
        }
    }
    public void delete(int q) {

        try{
        psts=conn.prepareStatement("delete studentdata where roll_no=?");
        psts.setInt(1,q);
        psts.executeUpdate();
        System.out.println("Data deletion successfull");

        } catch (SQLException e) {
            System.out.println("Data deletion uncsuccessfull");

        }

    }
    public void modify(String[] data){

        try {
            psts= conn.prepareStatement("update studentdata set fee=? where roll_no=?");
            psts.setInt(1, Integer.parseInt(data[2]));
            psts.setInt(2, Integer.parseInt(data[1]));
            psts.executeUpdate();
            System.out.println("Data modification successfull");

        } catch (SQLException e) {
            System.out.println("Data modification unsuccessfull");

        }
    }
    public void display()
    {
        System.out.printf("Roll No        "+ "Student Name         "+"Year      "+"Joining Date         "+"Fee");
            try {
                sts = conn.createStatement();
                res = sts.executeQuery("SELECT * FROM studentdata");
                while(res.next()){
                    System.out.println();
                    System.out.println(res.getInt("roll_no")+"            "+res.getString("Student_name")+"              "+
                            res.getString("year")+"        "+res.getString("jdate")+"           "+res.getInt("fee"));
                }
                conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void display(int q)
    {        System.out.printf("Roll No        "+ "Student Name         "+"Year      "+"Joining Date         "+"Fee");

        try {

            psts= conn.prepareStatement("select * from studentdata where roll_no=?");
            psts.setInt(1,q);
            ResultSet res = psts.executeQuery();
            System.out.println();
            while(res.next()){
                System.out.println(res.getInt("roll_no")+"            "+res.getString("Student_name")+"              "+
                        res.getString("year")+"        "+res.getString("jdate")+"           "+res.getInt("fee"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void drivertest() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
    }


}
