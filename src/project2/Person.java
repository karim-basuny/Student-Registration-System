/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;
/**
 *
 * @author Acer
 */
public class Person {
    
    protected int  ID;
    protected String name;
    protected String address;
    protected String telephone_number;
    protected String department;

    public Person() {
        
    }
    
    public Person(int  ID, String name, String address, String telephone_number, String department) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.telephone_number = telephone_number;
        this.department = department;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public String getDepartment() {
        return department;
    }
}


