/*
    b. WAP to take input on three sides of the triangle and check if the triangle is equilateral or isosceles or scalene.
 */

package conditionalstatements;

import java.util.Scanner;

public class TypesOfTriangle {

    public static void main(String[] args){

        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a==b && b==c){
            System.out.println("It is an equilateral triangle");
        }
        else if(a==b || b==c || c==a){
            System.out.println("It is an isosceles triangle");
        }
        else if(a!=b && b!=c && c!=a){
            System.out.println("It is an scalene triangle");
        }
        else {
            System.out.println("Invalid input");
        }
    }

}
