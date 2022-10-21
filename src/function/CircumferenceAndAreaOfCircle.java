/*
    4. Write a program to print the circumference and area of a circle of
    radius entered by the user by defining your own method.
 */


package function;

import static java.lang.Math.PI;

public class CircumferenceAndAreaOfCircle {

    public void calcCircumference(int r){

        double circum = 2*PI*r;
        System.out.println("The circumference of the circle is "+circum);

    }

    public void calcArea(int r){

        double area = PI*r*r;
        System.out.println("The area of the circle is "+ area);
    }

    public static void main(String[] args){

        CircumferenceAndAreaOfCircle obj = new CircumferenceAndAreaOfCircle();
        obj.calcCircumference(5);
        obj.calcArea(5);
    }
}

