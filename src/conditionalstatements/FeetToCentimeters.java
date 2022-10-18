/*
e. WAP to take the person's height in feet and convert it into centimeters and display it.
 */

package conditionalstatements;

import java.util.Scanner;

public class FeetToCentimeters {

    public static void main(String[] args){
        double feet, cm;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in feet");
        feet = input.nextDouble();
        System.out.println("You height in feet is "+ feet+" ft.");

        cm = feet*30.48;
        System.out.println("Your height in centimeters is "+ cm+" cm.");
    }
}
