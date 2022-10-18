/*
    15. Wap to reverse the array.
 */

package array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 4, 1, 8, 4};
        int length = arr.length;

        System.out.println("The given array is");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println("\nArray in reverse order is");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
