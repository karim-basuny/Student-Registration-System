/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;


/**
 *
 * @author Sama
 */

    import java.util.Scanner;
import java.util.ArrayList;

public class Student extends Person {
    int c;
    int r;
    private String BD;       // BD = date of birth
    private int enrolled_year;
    private String semester;
    private String registered_courses;
    private String coursesTaken;
    private String periods;

    public Student() {
    }
    
    public Student(int ID , String name, String address , String telephone_number , String department ,String BD,int y , String semester , String courses, String periods ){
        super(ID, name, address, telephone_number, department );
        this.BD=BD;
        enrolled_year = y;
        this.semester= semester;
        registered_courses=courses;
        this.periods=periods;
    }
    Scanner input = new Scanner(System.in);
 

     public void setperiods( String periods){
         this.periods=periods;
    }  
    public void set_ID( ){
            int ID = input.nextInt();

         this.ID=ID;
    }
    public int get_ID(){
        System.out.println("the student's ID is:"+ ID);
        return ID;
    }
    
    public void set_name(){
            String name =input.next();

        this.name=name;
    }
    public String get_name(){
        System.out.println("the student's name is:"+name);
        return name;
    }
    
    public void set_address(){
            String address = input.next();
      this.address=address;
    }  
    public String get_address(){
        System.out.println("the student's address is:"+address);
        return address;
    }
    
    public void set_telephone_number(){
    String telephone_number = input.next();
         this.telephone_number=telephone_number;
    }
    public String get_telephone_number(){ 
       System.out.println("the student's phone number is:"+telephone_number);
        return telephone_number;
    }
    
     public void set_department(){
        String department =input.next();
        this.department=department;
    }  
    public String get_department(){
               System.out.println("the student's department is:"+department);
        return department;
    }
    
    public void set_BD(){
        String BD =input.next();
        this.BD=BD;

    }
    public void set_enrolled_year(){
       int enrolled_year =input.nextInt();

    }
    public void set_semester(){
          String semester =input.next();
          this.semester=semester;
    }
    
    public String get_BD(){
       System.out.println("the student's Birthday is:"+BD);
        return BD;
    }
    
    public int get_enrolled_year(){
      System.out.println("the student's enrolled year is:"+enrolled_year);
        return enrolled_year;
    }
    
    public String get_semester(){
       System.out.println("the student's semester is:"+semester);
        return semester;
    }
    
public String getperiods(){
        return periods;
    }

   
    /*method that Must maintain all the courses a student has already 
taken/registered.*/
 public void register_courses() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of registered courses: ");
        int s = input.nextInt();
        input.nextLine();
         ArrayList<String> courses = new ArrayList<>();

        for (int i = 1; i <= s; i++) {
            System.out.print("Enter the name of course " + i + ": ");
            String course = input.nextLine();
            courses.add(course);
        }
        
        System.out.println("Registered courses: " + courses.toString());
    }
 /* A student cannot register a course if, the student doesn’t meet 
the prerequisites, the Students registered in the course exceed 
the capacity of the classroom, and the Course has a time conflict 
with other courses in the same term. */
  
 public void check_capacity( int c, int r){     
     if(c==r){
         System.out.println("the class is successfully filled ");
     }else if(c<r){
               System.out.println("The student can't register in this course");
     } else{
               System.out.println("The student can register in this course ");
     }    
 }
}
 

