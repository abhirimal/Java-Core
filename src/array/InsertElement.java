/*
    34.  Write a java program to insert an element (specific position) into an array.
 */

package array;

import java.util.Scanner;

public class InsertElement {

    public static void main(String args[]){

        int[] arr = {1,6,4,9,22,5};
        int size = arr.length;

        System.out.println("The given array is ");
        for(int i=0;i<size; i++){
            System.out.print(arr[i]+" ");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("\n Choose a position from 1 to "+(size-1)+", where you want to insert a element");
        int a = input.nextInt();

        System.out.println("Enter the number you want to insert in this array");
        arr[a]= input.nextInt();

        System.out.println("The updated array is ");
        for(int i=0;i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
