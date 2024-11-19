import Connection.*;

import javax.swing.*;
import java.sql.*;
public class Main {
    public static void main(String []args) {
        try {
            Connection con = ConnectionProvider.getConnection();
//            String q = "insert into table1(tName, tCity) values(?,?)";

              String q = "select * from table1";
//            PreparedStatement ptstmt = con.prepareStatement(q);
//            ptstmt.setString(1,"John");
//            ptstmt.setString(2, "Bengaluru");
//            ptstmt.executeUpdate();
//            System.out.println("done...");

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next()){
                int id = set.getInt("tId");
                String name = set.getString("tName");
                String city = set.getString("tCity");
                System.out.print(id);
                System.out.println(' ' + name + ' ' + city);
            }

            JOptionPane.showMessageDialog(null, "Data fetch Successfully");
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}