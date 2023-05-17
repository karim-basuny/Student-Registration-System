/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Classroom {
      protected int id;
    protected int timee = 5;
    protected String location;
    protected int capacity=0;
    protected ArrayList<Course> courses;
    protected int numbuerofclass;
protected String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public int getNumbuerofclass() {
        return numbuerofclass;
    }

    public void setNumbuerofclass(int numbuerofclass) {
        this.numbuerofclass = numbuerofclass;
    }
 public void  setTimee(int timee) {
        this.timee = timee;
        
    }

    @Override
    public String toString() {
        return "Classroom{" + "id=" + id + ", timee=" + timee + ", location=" + location + ", capacity=" + capacity + ", courses=" + courses + ", numbuerofclass=" + numbuerofclass + '}';
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
}

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }


  
    

    public int getId() {
        return id;
    }

    public Classroom() {
                this.courses = new ArrayList<>();

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Classroom(int id, String location, int capacity, ArrayList<Course> courses, int numbuerofclass) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.courses = courses;
        this.numbuerofclass = numbuerofclass;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
    this.courses.add(course);
}
  public boolean checkCapacity(int[] currentCapacities, int maxCapacity) {
    for (int i = 0; i < currentCapacities.length; i++) {
        if (currentCapacities[i] >= maxCapacity) {
            return true;
        }
    }
    return false;
}  

    }
