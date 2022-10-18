/*
WAP to check if a person is eligible to cast a vote or not. PS make your own age for eligibility.
 */

package conditionalstatements;

import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args){

        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible to cast a vote.");
        }
        else{
            System.out.println("You are not eligible to cast a vote.");
        }
    }
}
