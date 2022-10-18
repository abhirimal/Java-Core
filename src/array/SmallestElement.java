/*
    14.  Find the minimum and maximum element in an array.
 */

package array;

public class SmallestElement {

    public static void main(String[] args){

        int[] arr = {20,6,-8,100,250,65,12};
        int small=arr[0];
        int large=arr[0];
        int length = arr.length;

        for(int i=0; i<length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("The minimum element of the given array is "+ small);

        for(int i=0; i<length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("The maximum element of the given array is "+large);


    }
}
