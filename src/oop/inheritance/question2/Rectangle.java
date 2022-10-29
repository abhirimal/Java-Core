/*
    2. Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods
       to print the area and perimeter of the rectangle respectively. Its constructor having parameters
       for length and breadth is used to initialize length and breadth of the rectangle. Let class
       'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side
       (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and
       perimeter of a rectangle and a square.
 */

package oop.inheritance.question2;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public void printArea() {
        int area;
        area = length * breadth;
        System.out.println("Area: " + area);
    }

    public void printPerimeter() {
        int perimeter;
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }

}
