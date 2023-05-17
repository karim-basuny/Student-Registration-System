/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Instructor extends Person {
    public Instructor(String name, int ID,String address,String telephone, String department ) {
        this.ID=ID;
        this.name=name;
        this.address=address;
        this.department=department;
        this.telephone_number=telephone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setDepartment() {
         Scanner input =new Scanner(System.in);
         System.out.println("How many departments you work in?");
         int n =input.nextInt();
         String [] d1= new String[n];
         System.out.println("enter the departments you work in");
         for(int i=0; i<n; i++){
            String department= input.next(); 
         }
    }

    @Override
    public String toString() {
        return "Instructor{"+"name is " + this.getName()+"\n"+ "telephone number is "+this.getTelephone_number()+"\n"+ "ID is "+this.getID()+ "\n"+"address is"+this.getAddress()+")";
    }

 
            
}
