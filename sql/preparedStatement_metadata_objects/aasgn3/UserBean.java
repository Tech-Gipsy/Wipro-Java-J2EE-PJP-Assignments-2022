package sql.preparedStatement_metadata_objects.aasgn3;

public class UserBean {
    private String ID;
    private String Password;
    private String Name;
    private int Incorrect_Attempts;
    private int Lock_Status;
    private String User_Type;
    public UserBean(String i, String pass, String n, int ia, int ls, String ut)
    {
        this.ID=i;
        this.Password=pass;
        this.Name=n;
        this.Incorrect_Attempts=ia;
        this.Lock_Status=ls;
        this.User_Type=ut;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIncorrect_Attempts() {
        return Incorrect_Attempts;
    }

    public void setIncorrect_Attempts(int incorrect_Attempts) {
        Incorrect_Attempts = incorrect_Attempts;
    }

    public int getLock_Status() {
        return Lock_Status;
    }

    public void setLock_Status(int lock_Status) {
        Lock_Status = lock_Status;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "ID='" + ID + '\'' +
                ", Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", Incorrect_Attempts=" + Incorrect_Attempts +
                ", Lock_Status=" + Lock_Status +
                ", User_Type='" + User_Type + '\'' +
                '}';
    }
}
