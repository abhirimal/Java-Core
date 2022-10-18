/*
    5. Write a Java program to print the area and perimeter of a rectangle.
 */

package operators;

public class AreaPerimeterRectangle {

    public static void main(String[] args){

        double l = 1.5;
        double b =5;
        double area = l*b;
        double perimeter = 2*(l+b);

        System.out.println("The area of rectangle is "+area+" and the perimeter of rectangle is "+perimeter);
    }
}
