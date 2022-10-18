/*
     36. Write a java program to find the second-smallest element in an array.
 */

package array;

public class SecondSmallest {

    public static void main(String[] args){

        int[] arr = {25,1,5,4,3,8,9};
        int size = arr.length;

        // First we will sort the array in ascending order

        for(int i=0; i<size; i++){

            for(int j=i+1; j<size; j++){

                // swap the elements if 1st element is larger than other elements
                if(arr[i]>arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The sorted array is ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n The second smallest element from the given array is "+ arr[1]);


    }
}
