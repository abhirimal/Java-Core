/*
c. WAP check if a number is positive or not
 */

package conditionalstatements;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){

        int num1;
        System.out.println("Enter a number.");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();

        if(num1>0){
            System.out.println(num1+ " is positive number");
        }
        else{
            System.out.println(num1+" is a negative number");
        }
    }
}
