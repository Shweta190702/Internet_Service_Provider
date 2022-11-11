import java.sql.*;
import java.sql.DriverManager;


public class javaconnect {
    Connection conn;
    public static java.sql.Connection ConnecrDb(){
        try{

            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3000/isp", "root", "pradumya");
            return conn;
        } catch(Exception e){

        }
        return null;
    }
}
