package database.connection;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RegisterNewStudent {
    private Connection con;
    private String EnrollmentNo;
    private String Name;
    private String Branch;
    private String Course;
    private String City;
    private File Photo;

    public RegisterNewStudent(){
        super();
    }

    public void setCon(ConnectionProvider connectionProvider) {
        this.con = connectionProvider.getCon();
    }

    public void registerNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Enrollment No. ");
        EnrollmentNo = sc.nextLine();

        System.out.println("Enter Student Name");
        Name = sc.nextLine();

        System.out.println("Enter Student Course");
        Course = sc.nextLine();

        System.out.println("Enter Student Branch");
        Branch = sc.nextLine();

        System.out.println("Enter Student City");
        City = sc.nextLine();

        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Select Student Photo");
        int result = jfc.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            Photo = jfc.getSelectedFile();
            if (Photo != null && Photo.exists()) {
                System.out.println("File selected: " + Photo.getAbsolutePath());
            } else {
                System.out.println("The selected file does not exist.");
            }
        } else {
            System.out.println("No file was selected.");
        }



        String query = "insert into studentinfo( EnrollmentNo , Name, Branch, Course, City, Photo) values(?,?,?,?,?,?)";
        try{
            PreparedStatement ptstmt = con.prepareStatement(query);
            ptstmt.setString(1, EnrollmentNo);
            ptstmt.setString(2, Name);
            ptstmt.setString(3, Branch);
            ptstmt.setString(4, Course);
            ptstmt.setString(5,City);
            FileInputStream imageFile = new FileInputStream(Photo);
            ptstmt.setBinaryStream(6,imageFile,imageFile.available());

            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student Registered Successfully");


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
