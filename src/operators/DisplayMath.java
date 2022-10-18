/*
    2. Write a java program to take two number input from the user and display its sum,product,difference,quotient
    and remainder. Display invalid number as a message if any one of the numbers is less than or equals zero
 */

package operators;

import java.util.Scanner;

public class DisplayMath {

    public static void main(String[] args){

        int sum, product, difference, quotient, remainder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("The two numbers are "+ a + " and "+ b);

        if(a>0 && b>0){
            sum = a+b;
            product = a*b;
            difference=a-b;
            quotient = a/b;
            remainder=a%b;
            System.out.println("The sum is "+ sum + ", product is "+ product + ", difference is "+difference +", quotient is "+quotient+" and remainder is "+remainder);
        }
        else{
            System.out.println("The number is invalid");
        }
    }
}
