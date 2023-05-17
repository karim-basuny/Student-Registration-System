/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

import java.util.ArrayList;
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

//main of the department
        ArrayList<Instructor> instructor = new ArrayList<>();
        
        for(int i = 0;i<3;i++){
            System.out.println("Enter the department's name then the ID  then the address then telephone_number then department");
            instructor.add(new Instructor(input.next(), input.nextInt(), input.next(), input.next(), input.next()));
        }
        
        Department d = new Department();
        d.setInstructors(instructor);
//end of the department
//main Instructor
    Instructor i1= new Instructor("ahmed",1,"dd","01204455011","cs","ds");
      Instructor i2= new Instructor("hassan",2,"nn","01269564006","cs","ds");
       Instructor i3= new Instructor("mohamed",3,"mm","01099345764","cs","ds");
        Instructor i4= new Instructor("essra",4,"pp","01128945096","cs","ds");
         Instructor i5= new Instructor("sara",5,"oo","01023789456","cs","ds");
         //end of Instructor

    }
    
}
