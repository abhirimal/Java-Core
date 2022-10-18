/*
    40. Write a java program to get the difference between the largest and smallest values in an array of integers.
    The length of the array must be 1 and above.
 */

package array;

public class Difference {

    public static void main(String[] args) {

        int[] arr = {5, 2, 10, 81, 9, 33};
        int size = arr.length;
        int small = arr[0];
        int large = arr[0];
        int diff;

        System.out.println("The array is ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        //finding smallest element

        for (int i = 1; i < size; i++) {

            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("\n The smallest element is " + small);

        //finding largest element

        for (int i = 1; i < size; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The largest element is " + large);

        //difference between smallest and largest element

        diff = large - small;
        System.out.println("The difference between the largest and smallest element of the array is " + diff);
    }
}
