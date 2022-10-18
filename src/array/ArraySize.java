/*
    10. WAP to create an integer array of size 10 , read the array elements
    from the user and display the array elements.

 */

package array;

import java.util.Scanner;

public class ArraySize {

    public static void main(String[] args){

        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");


        for(int i=0; i< arr.length;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("The elements of an array are");
        for(int i=0; i<10;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
