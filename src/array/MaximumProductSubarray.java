/*
    26. Find maximum product subarray.
 */

package array;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 4, 1};
        int size = arr.length;
        int product = arr[0];

        for (int i = 0; i < size; i++) {

            int mul = arr[i];

            for (int j = i + 1; j < size; j++) {

                mul = mul * arr[j];
            }

            if (mul > product) {
                product = mul;
            }

        }

        System.out.println(product);


    }
}

//still incomplete, maximum product remaining for negative integers