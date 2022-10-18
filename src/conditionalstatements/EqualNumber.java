/*
    a. Write a java program to accept two integers and check whether they are equal or not.
 */

package conditionalstatements;

import java.util.Scanner;

public class EqualNumber {

    public static void main(String[] args){

        int num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1==num2){
            System.out.println(num1+" and "+num2+" are equal");
        }
        else{
            System.out.println(num1+" and "+num2+" are not equal");
        }

    }

}
