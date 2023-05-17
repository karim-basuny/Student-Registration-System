
package project2;

import java.util.ArrayList;

public class Department {
    
    private String id;
    private String name;
    private Instructor instructors;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor instructors) {
        this.instructors = instructors;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", instructors=" + instructors.getName() + '}';
    }

   
    
}
