package sql.Miniproject;

import org.junit.runners.Suite;
import sql.preparedStatement_metadata_objects.aasgn3.UserBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.Class.forName;

public class miniproject {
    static Connection conn;
    static Statement sts;
    static PreparedStatement psts;
    static ResultSet res;
    static ResultSetMetaData rsmd;
    static String sqlurl="jdbc:oracle:thin:@localhost:1521:orcl";

    public static void main(String[] args) throws SQLException {
    database();
    //Scenerio 1
    System.out.println("Scenario 1");

    System.out.println(getUserType("AB1001"));
        System.out.println("Scenario 2");
    System.out.println(getIncorrectAttempts("AB1001"));
        System.out.println("Scenario 3");
    System.out.println(changeUserType("TA1002"));
        System.out.println("Scenario 4");
    System.out.println(getLockStatus());
        System.out.println("Scenario 5");
    System.out.println(changeName("AB1001","alexa"));
        System.out.println("Scenario 6");
    System.out.println(changePassword("rj45"));
        System.out.println("Scenario 7");
    UserBean bean=new UserBean("RB3002","RB3002","Friday",0,0,"It");
    System.out.println(addUser_1(bean));
        System.out.println("Scenario8");
    UserBean b1=new UserBean("RB4002","RB4002","day",1,1,"It");
    System.out.println(addUser_2(b1));
        System.out.println("Scenario 9");
        ArrayList rr1=storeAllRecords();
        Iterator itr1=rr1.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next().toString());
        }

        System.out.println("Scenario 10");
        ArrayList rr=getUsers("Admin");
        Iterator itr=rr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next().toString());
        }
        System.out.println("Scenario 11");
        String[] a=getNames();
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }


    }
    static String getUserType(String userID) throws SQLException {
        conn = DriverManager.getConnection(sqlurl,"hr", "hr");
        psts=conn.prepareStatement("select * from users where userID=?");
        psts.setString(1, userID);
        res=psts.executeQuery();
        while(res.next())
            return res.getString("UserType");
        return null;
    }
    static String getIncorrectAttempts(String userID) throws SQLException
        {        conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            psts = conn.prepareStatement("select * from users where userID=?");
            psts.setString(1, userID);
            res = psts.executeQuery();
            while (res.next()) {
                int i=res.getInt("IncorrectAttempts");
                if (i==0)
                    return "No Incorrect Attempt";
                else if (i==1)
                    return "Onet Time";
                else
                    return "Incorrect Attempt Exceeded";
            }
            return null;
        }
        static String changeUserType(String userID) throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            psts = conn.prepareStatement("update users set UserType='Admin'where userID=?");
            psts.setString(1,userID);
            int i=psts.executeUpdate();
            if(i!=0)
            {
                return "Update Success";
            }
            else
            {
                return "Update failed";
            }

        }
        static int getLockStatus() throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            sts=conn.createStatement();
            res=sts.executeQuery("select * from users where LockStatus=0");
            int i=0;

            while(res.next())
            {
                i+=1;
            }
            return i;
        }
        static String changeName(String id,String name) throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            psts = conn.prepareStatement("update users set Name=? where UserID=?");
            psts.setString(1, name);
            psts.setString(2, id);
            if (psts.executeUpdate() != 0) {
                return "Success";
            } else {
                return "Failed";
            }
        }
        static String changePassword(String password) throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            psts = conn.prepareStatement("update users set Password=? where UserType='Admin'");
            psts.setString(1, password);
            if (psts.executeUpdate() != 0) {
                return "Changed";
            } else {
                return "0";
            }
        }
        static String addUser_1(UserBean bean) throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            psts=conn.prepareStatement("insert into Users values(?,?,?,?,?,?)");
            psts.setString(1,bean.getID());
            psts.setString(2, bean.getPassword());
            psts.setString(3,bean.getName());
            psts.setInt(4,bean.getIncorrect_Attempts());
            psts.setInt(5,bean.getLock_Status());
            psts.setString(6,bean.getUser_Type());
            int i=psts.executeUpdate();
            return (i==1 ? "Success":"Fail");
        }
        static String addUser_2(UserBean bean) throws SQLException {
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");

            if (bean.getLock_Status()==0)
            {
                psts=conn.prepareStatement("insert into Users values(?,?,?,?,?,?)");
                psts.setString(1,bean.getID());
                psts.setString(2, bean.getPassword());
                psts.setString(3,bean.getName());
                psts.setInt(4,bean.getIncorrect_Attempts());
                psts.setInt(5,bean.getLock_Status());
                psts.setString(6,bean.getUser_Type());
                int i=psts.executeUpdate();
                return (i==1 ? "Success":"Fail");
            }
            else
            {
                return "Fail";
            }
        }
        static ArrayList<UserBean> getUsers(String userType) throws SQLException {
            ArrayList<UserBean> ub=new ArrayList<UserBean>();
            conn = DriverManager.getConnection(sqlurl,"hr", "hr");


            psts= conn.prepareStatement("select * from users where usertype=?");
            psts.setString(1,userType);
            res=psts.executeQuery();
            while(res.next())
            {
                UserBean temp=new UserBean(res.getString("UserID"),
                        res.getString("Password"),res.getString("Name"),
                        res.getInt("IncorrectAttempts"), res.getInt("Lockstatus"),
                        res.getString("UserType"));
                ub.add(temp);
            }
            return  ub;
        }
    static ArrayList<UserBean> storeAllRecords() throws SQLException {
        conn = DriverManager.getConnection(sqlurl,"hr", "hr");
        ArrayList<UserBean> ub=new ArrayList<UserBean>();
        psts= conn.prepareStatement("select * from users");
        res=psts.executeQuery();
        while(res.next())
        {
            UserBean temp=new UserBean(res.getString("UserID"),
                    res.getString("Password"),res.getString("Name"),
                    res.getInt("IncorrectAttempts"), res.getInt("Lockstatus"),
                    res.getString("UserType"));
            ub.add(temp);
        }
        return  ub;
    }
    static String[] getNames() throws SQLException {

        List ll=new ArrayList();
        conn = DriverManager.getConnection(sqlurl,"hr", "hr");

        psts= conn.prepareStatement("select * from users");
        res=psts.executeQuery();
        int i=0;
        while(res.next()) {
            ll.add(res.getString("Name"));
        }
        i=ll.size();
        String[] d=new String[i];
        for(int j=0;j<i;j++)
        {
            d[j]= (String) ll.get(j);
        }
        return d;

    }
    static void database()
    {
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
