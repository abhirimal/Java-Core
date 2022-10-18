/*
    10. Write a java program to find if the triangle is equilateral or not.

 */

package operators;

import java.util.Scanner;

public class CheckEquilateralTriangle {

    public static void main(String[] args){

        int l1,l2,l3;
        System.out.println("Enter the length of 3 sides of the triangle");
        Scanner input = new Scanner(System.in);
        l1 = input.nextInt();
        l2 = input.nextInt();
        l3 = input.nextInt();

        if(l1==l2 && l2==l3){
            System.out.println("It is equilateral triangle");
        }
        else{
            System.out.println("It is not equilateral triangle");
        }

    }
}
