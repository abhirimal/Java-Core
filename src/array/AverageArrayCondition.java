/*
     41. Write a java program to compute the average value of an array of integers except the largest and smallest  values.
 */

package array;

public class AverageArrayCondition {

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 3, 8, 9};
        int size = arr.length;
        double sum=0;
        double average;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (arr[i] > arr[j]) {
                    int temp;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // sum except smallest and largest elements
        for(int i=1;i<size-1;i++){
            sum = sum + arr[i];
        }

        average = sum/(size-2);
        System.out.println("The average of the array except the largest and smallest  values is "+ average);

    }

}
