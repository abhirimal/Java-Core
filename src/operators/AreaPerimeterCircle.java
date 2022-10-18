/*
    6. Write a Java program to print the area and perimeter of a circle.
 */

package operators;

public class AreaPerimeterCircle {

    public static void main(String[] args){

        double radius = 5;
        double pi = 22.0/7.0;
        double area = pi * radius* radius;
        double perimeter = 2 * pi * radius;

        System.out.println(pi);
        System.out.println("The area of circle is "+ area + " and the perimeter of circle is "+perimeter);

    }
}
