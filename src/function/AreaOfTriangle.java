/*
    31. Write Java methods to calculate the area of a triangle.
        Expected Output:
        Input Side-1: 10
        Input Side-2: 15
        Input Side-3: 20
        The area of the triangle is 72.6184377413890

 */
package function;

public class AreaOfTriangle{

    public double calculateArea(int a, int b, int c){
        int s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public static void main(String[] args){

        AreaOfTriangle obj = new AreaOfTriangle();
        double area = obj.calculateArea(10,15,20);
        System.out.println("The area of triangle is "+area);
    }
}

