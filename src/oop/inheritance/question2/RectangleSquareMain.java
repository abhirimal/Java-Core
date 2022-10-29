package oop.inheritance.question2;

public class RectangleSquareMain {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(5, 10);
        System.out.println("The area and perimeter of rectangle are: ");
        rec.printArea();
        rec.printPerimeter();

        Square square = new Square(5);
        System.out.println("The area and perimeter of square are: ");
        square.printArea();
        square.printPerimeter();

    }
}
