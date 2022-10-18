/*
    16. Wap to sort the given array.

    // Sorting array in ascending order.
 */

package array;

public class SortArray {

        public static void main(String[] args){

                int[] arr = {1,5,4,3,8,9};
                int size = arr.length;

                for(int i=0; i< size; i++){
                        for(int j=i+1;j<size; j++){

                                if(arr[i]>arr[j]){
                                        int temp;

                                        temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                }
                        }
                }

                for(int i =0; i<size; i++){
                        System.out.print(arr[i]+" ");
                }
        }
}
