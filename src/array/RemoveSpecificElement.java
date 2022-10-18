/*
    33.  Write a java program to remove a specific element from an array.
 */

package array;

public class RemoveSpecificElement {

    public static void main(String[] args){

        int[] arr1 = {3,1,20,81,9,14};
        int size = arr1.length;
        int[] arr2 = new int[size-1];

        int num = 20;

        // print all the element of array

        for(int i=0,j=0; i<size; i++){

            // if the element of array matches the specified element then it skips the loop once
            if(arr1[i]==num){
                continue;
            }

            //assigning elements to new array

            arr2[j] = arr1[i];
            j++;
        }

        System.out.println("The new array is ");
        for(int i=0; i<size-1; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
