/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // student main
         Student s=new Student();
        System.out.println("Enter Student's name:");
        s.set_name();
        System.out.println("Enter Student's ID:");
        s.set_ID();
        System.out.println("Enter Student's address:");
        s.set_address();
        System.out.println("Enter Student's phone number:");
        s.set_telephone_number();
        System.out.println("Enter Student's department:");
        s.set_department();
        System.out.println("Enter Student's Birthday:");
        s.set_BD();
        System.out.println("Enter Student's enrolled year:");
        s.set_enrolled_year();
        System.out.println("Enter Student's semester:");
        s.set_semester();
        //to print student's informations
        s.get_name();
        s.get_ID();
        s.get_address();
        s.get_telephone_number();
        s.get_department();
        s.get_BD();
        s.get_enrolled_year();
        s.get_semester();

 
s.register_courses();
Scanner input = new Scanner(System.in);
System.out.println("enter the capacity");
int c=input.nextInt();
System.out.println("enter the number of students");
int r=input.nextInt();
  s.check_capacity(c,r);
// end of student main
    }
    
}
