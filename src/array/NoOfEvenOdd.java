/*
    39.  Write a java program to find the number of even and
    odd integers in a given array of integers.
 */

package array;

public class NoOfEvenOdd {

    public static void main(String[] args){

        int[] arr = {4,9,18,55,42,7,2};
        int size = arr.length;
        int count1=0, count2=0;

        for(int i=0; i<size; i++){

            if((arr[i]%2)==0){
                count1++;
            }
            else
                count2++;
        }

        System.out.println("There are "+count1+" even numbers and "+count2+" odd numbers.");
    }
}
