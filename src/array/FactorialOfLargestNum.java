/*
    25.  Find the factorial of a largest number in an array.
 */

package array;

public class FactorialOfLargestNum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4, 9};
        int size = arr.length;
        int large = arr[0];
        long fact = 1;

        // Firstly, Finding the largest number

        for (int i = 1; i < size; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The largest number is " + large);

        //Calculating factorial of the largest number;

        for (int i = 1; i <= large; i++) {
            fact = i * fact;

        }

        System.out.println("The factorial of largest number is "+ fact);

    }
}