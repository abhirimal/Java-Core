/*
    29. Find a triplet that sums to a given value.
        Example:
        Input:
        n = 6, X = 13
        arr[] = [1 4 45 6 10 8]
        Output:
        1
        Explanation:
        The triplet {1, 4, 8} in the array sums up to 13.

 */

package array;

import java.util.Scanner;

public class SumOfTriplet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array. ");
        int size = input.nextInt();

        System.out.println("Enter " + size + " elements in the array");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = input.nextInt();
        }

        System.out.println("Enter the sum you want to find");
        int sum = input.nextInt();

        // finding the triplets

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                for (int k = j + 1; k < size; k++) {

                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("The triplet " + arr[i] + " " + arr[j] + " " + arr[k] + " in the array sums up to " + sum);
                    }

                }
            }
        }


    }
}
