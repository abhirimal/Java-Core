/*
    32. Write a java program to calculate the average value of array elements.

 */

package array;

public class AverageArray {

    public static void main(String[] args){

        int[] arr = {10,15,16,20,13};
        double sum = 0;
        double average;
        int length = arr.length;

        for (int i = 0; i< length; i++){
            sum = sum + arr[i];
        }

        average = sum/ length;

        System.out.println("The average of an element of an array is "+ average);
    }
}
