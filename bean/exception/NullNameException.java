package mile1.bean.exception;

public class NullNameException extends Exception{

    @Override
    public String toString()
    {
        return "name is null";
    }
}
