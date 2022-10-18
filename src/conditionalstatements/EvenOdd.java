/*
b. Write a java program to check if the input number is even or not
 */

package conditionalstatements;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        num = input.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }

    }
}
