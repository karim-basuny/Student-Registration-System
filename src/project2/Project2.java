/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws WriterException, IOException {
            
    MyFrame m = new MyFrame();
    
////classroom
// Classroom a=new Classroom();
//   a.setNumbuerofclass(401);
//   
//      Classroom b=new Classroom();
//   b.setNumbuerofclass(402);
//      Classroom g=new Classroom();
//   g.setNumbuerofclass(403);
//         Classroom d=new Classroom();
//   d.setNumbuerofclass(404);
//    Classroom o=new Classroom();
//   o.setNumbuerofclass(405);
//
//
//// TODO code application logic here
//        // student main
//      try{   Student s=new Student();
//        System.out.println("Enter Student's name:");
//        s.set_name();
//        
//        s.get_ID();
//        System.out.println("Enter Student's address:");
//        s.set_address();
//        System.out.println("Enter Student's phone number:");
//        s.set_telephone_number();
//        System.out.println("Enter Student's department:");
//        s.set_department();
//        System.out.println("Enter Student's Birthday:");
//        s.set_BD();
//        System.out.println("Enter Student's enrolled year:");
//        s.set_enrolled_year();
//        System.out.println("Enter Student's semester:");
//        s.set_semester();
//        //to print student's informations
//        s.get_name();
//        s.get_ID();
//        s.get_address();
//        s.get_telephone_number();
//        s.get_department();
//        s.get_BD();
//        s.get_enrolled_year();
//        s.get_semester();
//
// 
//      }
//      catch(InputMismatchException e){
//          System.out.println("Please retart the code");
//          return;
//      }
//// end of student main
////main Instructor
//    Instructor i1= new Instructor("ahmed",1,"dd","01204455011","ds");
//      Instructor i2= new Instructor("hassan",2,"nn","01269564006","ds");
//       Instructor i3= new Instructor("mohamed",3,"mm","01099345764","ds");
//        Instructor i4= new Instructor("essra",4,"pp","01128945096","cs");
//         Instructor i5= new Instructor("sara",5,"oo","01023789456","cs");
//                 Instructor i6= new Instructor("Mark",6,"oo","01055789456","cs");
//
//         //end of Instructor
////main of the department
//       
//        
//        Department ds = new Department();
//        ds.setName("Data structure");
//         Department Cs = new Department();
//         Cs.setName("Computer Science");
//        
//        
//       
////end of the department
//
// // main course 
//     
//Course data = new Course("data",0,i1,2,3,a,2,"programming2","Data and algorithm",ds);
//Course cs = new Course("cs",1,i2,1,3,b,3,"introcs","computersystembook",Cs);
//Course Numerical = new Course("Numerical",2,i3,2,3,g,1,"Linear algebra","Numerical and number theory",ds);
//Course programming2 = new Course("programming2",3,i4,1,3,d,5,"programming1","intro to java",Cs);
//Course probability2 = new Course("probability2",4,i5,2,3,o,1,"probability1"," probabilty2 book",ds);
//Course Math1 = new Course("Math1",5,i6,1,3,g,3,"Math0","intro to math1",ds);
//Course[] c = new Course[6];
//c[0]=data;
//c[1]=cs;
//c[2]=Numerical;
//c[3]=programming2;
//c[4]=probability2;
//c[5]=Math1;
//          System.out.println("Courses Available :");
//        for (Course c1 : c) {
//            System.out.println("Name: " + c1.getName() + "  Number of course: " + c1.getNumber());
//        }
//Scanner ll= new Scanner(System.in);
//        System.out.println("Enter number of courses you want to register ");
//        int w=ll.nextInt();
//        for(int k=1;k<=w;k++){
//            System.out.println("Enter the number of course ");
//           int bb = ll.nextInt();
//         
//                      System.out.println("Name: " + c[bb].getName()+"  Number of course: "+c[bb].getNumber());
//            
//            System.out.println("Instructor: " + c[bb].getInstructor());
//            System.out.println("Term: " + c[bb].getTerm());
//            System.out.println("Credits: " + c[bb].getCredits());
//            System.out.println("Classroom: " + c[bb].getClassroom());
//            System.out.println("Periods: " + c[bb].getTimee());
//            System.out.println("Prerequisite courses: " + c[bb].getPrerequisiteCourses());
//            System.out.println("Textbooks: " + c[bb].getTextbooks());
//            System.out.println();
//               
//           }
        /// end of course main
        
    }
    
}
