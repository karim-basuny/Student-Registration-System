/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Acer
 */
public class Course {
   private int  number;
   private Instructor instructor;
   protected int timee = 5;
   private int term;
   private int credits;
   private Classroom classroom;
   private String periods;
   private String prerequisiteCourses;
   private String textbooks;
   private String StudentsRegistered;
   private int Capacity;
   protected String name;
   
    public Course(){
    
    }
      
    public Course(String name,int number , Instructor instructor, int term, int credits, Classroom classroom, int timee,String prerequisiteCourses, String textbooks) {
        this.name = name;
        this.number=number;
        this.instructor = instructor;
        this.term = term;
        this.credits = credits;
        this.classroom = classroom;
       this.timee=timee;
        this.prerequisiteCourses = prerequisiteCourses;
        this.textbooks = textbooks;
    }

   

    
    

    public void setNumber(int number) {
        this.number = number;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }
    public void setPrerequisiteCourses( String PrerequisiteCourses ) {
     
        this.prerequisiteCourses=PrerequisiteCourses;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

    public void settextbooks(String textbooks) {
        this.textbooks=textbooks;
    }
    

    public int getNumber() {
        return number;
    }

    public String getInstructor() {
        return instructor.getName();
    }

    public int getTerm() {
        return term;
    }

    public int getCredits() {
        return credits;
    }

    public int getClassroom() {
        return classroom.getNumbuerofclass();
    }

    public String getPeriods() {
        return periods;
    }

   

    public String getTextbooks() {
        return textbooks;
    }      

    public void setStudentsRegistered(String StudentsRegistered) {
        this.StudentsRegistered = StudentsRegistered;
    }

    public String getStudentsRegistered() {
        return StudentsRegistered;
    }
    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }


    public String getPrerequisiteCourses() {
        return prerequisiteCourses;
    }
    public String getTimee() {
    switch (timee) {
        case 1:
            return "  From 8:30 till 10:30"
                    ;
        case 2:
            return "From 10:30 till 12:30";
        case 3:
            return "From 12:30 till 2:30";
        case 4:
            return "From 2:30 till 4:30";
        case 5:
            return "From 4:30 till 6:30";
        default:
            return "Invalid time period";
    }
} public void  setTimee(int timee) {
        this.timee = timee;
        
    }
 @Override
    public String toString() {
        return "Course{"  + ", name=" + name +"instructor=" +instructor.getName()+", term=" + term + ", credits=" + credits + ", classroom=" + classroom.getNumbuerofclass() + ", periods=" +this.getTimee() + ", prerequisiteCourses=" + prerequisiteCourses + ", textbooks=" + textbooks + ", StudentsRegistered=" + StudentsRegistered + ", Capacity=" + Capacity + '}';
    }
 
      
}
