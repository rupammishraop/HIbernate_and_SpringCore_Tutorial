package Connection;
import java.sql.*;
public class ConnectionProvider {
    public static Connection con;
    public static Connection getConnection() {
        try {
            if(con == null) {
                // load the driver in the memory
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Connection with the Database
                String url = "jdbc:mysql://localhost:3306/jdbc";
                String username = "root";
                String password = "Rupam@mysql9301";
                con = DriverManager.getConnection(url, username, password);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;

    }
}
