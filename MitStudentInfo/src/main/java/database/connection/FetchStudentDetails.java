package database.connection;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FetchStudentDetails {
    private Connection con;

    public FetchStudentDetails(){
        super();
    }

    public void setCon(ConnectionProvider connectionprovider) {
        this.con = connectionprovider.getCon();
    }

    public void fetchStudentDeatils(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enrollment No");
        String EnrollmentNo = sc.nextLine();
        String query = "SELECT * FROM studentinfo WHERE EnrollmentNo=?";
        try {
            PreparedStatement ptstmt = con.prepareStatement(query);
            ptstmt.setString(1,EnrollmentNo);
            ResultSet set = ptstmt.executeQuery();

            while(set.next()){
                String enrollmentNo = set.getNString("EnrollmentNo");
                String name = set.getString("Name");
                String course = set.getString("Course");
                String branch = set.getString("Branch");
                String city = set.getString("City");


                System.out.println("Enrollment No : " + enrollmentNo);
                System.out.println("Name : " + name);
                System.out.println("Course : " + course);
                System.out.println("Branch : " + branch);
                System.out.println("city : " + city);
                // Photo Printing with the help of Swing

                byte[] imgBytes = set.getBytes("Photo");

                if (imgBytes != null) {
                    // Convert byte array to an ImageIcon
                    ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                    Image img = ImageIO.read(bis);
                    ImageIcon icon = new ImageIcon(img);


                    JLabel photoLabel = new JLabel(icon);

                    // Create the JFrame to display the details and photo
                    JFrame frame = new JFrame("Student Photo");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

                    // Set the layout to accommodate all labels, using GridLayout with 6 rows
                    frame.setLayout(new GridLayout(1, 1));

                    // Adding labels to the frame

                    frame.add(photoLabel);

                    // Pack and set the frame to visible
                    frame.pack(); // Resizes the frame to fit the contents
                    frame.setVisible(true);


                } else {
                    System.out.println("No photo found for the student.");
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
