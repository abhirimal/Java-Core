/*
    c. WAP to check whether a triangle can be formed by the given value for the angles.[Sum  of the angles in a triangle should be 180
    Test Data :
    40 55 65
    Expected Output :
    The triangle is not valid.


 */

package conditionalstatements;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        int A,B,C;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three angles of a triangle");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        int sum = A+B+C;

        if(sum<180){
            System.out.println("The triangle is not valid");
        }
        else {
            System.out.println("The triangle is valid");
        }

    }
}
