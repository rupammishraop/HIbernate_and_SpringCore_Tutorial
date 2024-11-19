package main.code;

import database.connection.FetchStudentDetails;
import database.connection.RegisterNewStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Register New Student");
        System.out.println("2.Fetch Student Details");
        System.out.print(" ");
        Scanner sc = new Scanner(System.in);

        ApplicationContext context = new ClassPathXmlApplicationContext("configDB.xml");
        RegisterNewStudent student = (RegisterNewStudent) context.getBean("student");
        FetchStudentDetails fstudent = (FetchStudentDetails)  context.getBean("fstudent");
        int input = sc.nextInt();
        System.out.println(input);
        switch (input){
            case 1:
                student.registerNewStudent();
                break;
            case 2:
                fstudent.fetchStudentDeatils();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
