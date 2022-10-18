/*
    30. Find the smallest positive missing number.
        Example:
        Input:
        N = 5
        arr[] = {1,2,3,4,5}
        Output: 6
        Explanation: Smallest positive missing number is 6.

 */

package array;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array. ");
        int size = input.nextInt();

        System.out.println("Enter " + size + " elements in the array");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = input.nextInt();
        }

        // checking the missing number {1,2,3,4,5}

        int j=1;
        for(int i=0; i<size; i++){

                if(arr[i] != j ){
                    System.out.println("The smallest positive missing number is "+j);
                    break;

            }
                else{
                    j++;
                }

        }

        // this only executes if only the missing smallest positive number is not found in above loop
        if (j > size) {
            System.out.println("The smallest positive missing number is "+j);
        }

    }
}
