/*
    7. Write a Java program to print the area and perimeter of a square.
 */

package operators;

public class AreaPerimeterSquare {

    public static void main(String[] args){

        double length = 10;
        double area = length*length;
        double perimeter = 4*length;

        System.out.println("The area of square is "+area+" and perimeter is "+ perimeter);
    }
}
