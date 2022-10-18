/*
    8. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

 */

package operators;

import java.util.Scanner;

public class AverageInput {

    public static void main(String[] args){

        System.out.println("Enter three numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double sum = a+b+c;
        double average = sum/3;

        System.out.println("The average of 3 numbers is "+average);
    }
}
