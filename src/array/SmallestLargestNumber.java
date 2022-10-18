/*
    12. WAP to find the largest and smallest element in the array.
 */

package array;

public class SmallestLargestNumber {

    public static void main(String[] args){

        int[] arr = {8,5,7,2,12,10,3,6};
        int small=arr[0];
        int large=arr[0];
        int length = arr.length;

        for(int i=0; i<length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("The largest element of given array is "+ large);

        for(int i=0; i<length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("The smallest element of given array is "+ small);
    }
}
