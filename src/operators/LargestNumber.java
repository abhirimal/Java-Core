/*
    3. Write a java program to find the largest number from the three numbers taken from the user.
 */

package operators;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("The three entered numbers are "+a+", "+ b + ", "+c);

        if(a>b && a>c) {
            System.out.println("The largest number is " + a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number is "+ b);
        }
        else{
            System.out.println("The largest number is "+ c);
        }
    }
}
