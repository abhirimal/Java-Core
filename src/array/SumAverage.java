/*
    11. WAP to sum and average the elements of any array. Size of the array should be defined by the user and also input should be provided by the user.
 */

package array;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args){

        int size;
        double sum=0,average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Please enter "+size+" integers in your array ");

        for(int i=0;i<size;i++){

            arr[i] = input.nextInt();

        }

        for(int i=0; i<size; i++){
            sum = sum+arr[i];
        }

        average = sum/size;

        System.out.println("The sum of the elemts of an array is "+ sum);

        System.out.println("The average of the elements of an array is "+ average);

    }
}
