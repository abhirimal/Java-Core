/*
    26. Write a method to find the area of a circle.
 */

package function;

public class AreaOfCircle {

    public void printArea(double radius) {
        double area = (22.0 / 7) * radius * radius;
        System.out.println("The area of the circle is " + area);
    }

    public static void main(String[] args) {

        AreaOfCircle obj = new AreaOfCircle();
        obj.printArea(5);
    }
}
