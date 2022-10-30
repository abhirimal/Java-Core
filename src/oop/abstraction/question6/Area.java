package oop.abstraction.question6;

public class Area extends Shape{

    @Override
    public void RectangleArea(int length, int breadth) {
        int area = length*breadth;
        System.out.println("The area of rectangle is: "+area);
    }

    @Override
    public void SquareArea(int side) {
        int area = side*side;
        System.out.println("The area of square is : "+area);
    }

    @Override
    public void CircleArea(double radius) {
        double area = (22.0/7)*radius*radius;
        System.out.println("The area of circle is : "+area);
    }
}
