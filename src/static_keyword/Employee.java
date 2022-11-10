/*
    1. WAP to demonstrate static variable,method and block.
 */

package static_keyword;

public class Employee {

    int id;
    double salary;

    //static variable
    static String ceo = "Chandra Shumsher";

    public void display(){
        System.out.println(id+" : "+salary+" : "+ceo);
    }

    //this is static block. it will be executed after loading the .class file into JVM memory
    static{
        System.out.println("Hello from static block. I will be printed first. ");
    }

    // static method: it changes the value ot static variable
    public static void changeCEO(String ceo){
         Employee.ceo = ceo;
    }

    public static void main(String[] args){
        Employee ram = new Employee();

        ram.id=100;
        ram.salary=10000;
        ram.display();

        Employee hari = new Employee();
        hari.id=200;
        hari.salary=20000;
        hari.display();

        // updating the value of static variable
        Employee.changeCEO("Bhanu Bhakta Acharya");
        ram.display();
        hari.display();


    }
}
