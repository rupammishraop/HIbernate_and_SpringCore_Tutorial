package database.connection;

import javax.swing.*;
import java.sql.*;

public class ConnectionProvider {
    private Connection con;
    private String url;
    private String username;
    private String password;


    public ConnectionProvider(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public ConnectionProvider(){
        super();
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public Connection getCon() {
        return con;
    }


    public void initConnection() {
        try {
            // load the driver in the memory
            if(con == null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Connection
                con = DriverManager.getConnection(url, username, password);
                if(!con.isClosed()){
//                    System.out.println("Database Connection successfully");
                    JOptionPane.showMessageDialog(null, "Database Connected Successfully");
                }else {
                    System.out.println("failed with the database connection");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void destroy(){
        try{
           con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "ConnectionProvider{" +
                "con=" + con +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
