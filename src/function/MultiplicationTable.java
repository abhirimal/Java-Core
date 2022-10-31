/*
    14. WAP to print the multiplication table of a number using a function
        printMultiplication(int inputNumber)
 */

package function;

import java.util.Scanner;

public class MultiplicationTable {

    public void printMultiplication(int inputNumber){

        for(int i=1; i<11; i++){
            int mul;
            mul = inputNumber*i;
            System.out.println(inputNumber+" x "+i+" = "+mul);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number whose multiplication table you want to view.");
        int inputNumber = input.nextInt();

        MultiplicationTable table = new MultiplicationTable();
        table.printMultiplication(inputNumber);
    }
}
