package sql.preparedStatement_metadata_objects.assgn1;


import java.sql.SQLException;

public class JDBCCalls {
    public static void main(String[] args) throws SQLException {
        DAOclass doa=new DAOclass();

        switch(Integer.parseInt(args[0]))
        {
            case 1:
                //inserting record
                doa.insert(args);
                break;
            case 2:
                doa.delete(Integer.parseInt(args[1]));
                break;
            case 3:
                doa.modify(args);
                break;
            case 4:
                if (args.length > 1)
                    doa.display(Integer.parseInt(args[1]));
                else
                    doa.display();
                break;
        }

    }
}
