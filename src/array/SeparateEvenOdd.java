/*
    47. Write a Java program to separate even and odd numbers of a given
    array of integers. Put all even numbers first, and then odd numbers.
 */

package array;

public class SeparateEvenOdd {

    public static void main(String[] args){

        int[] arr = {1,6,47,9,10,18,3};
        int size = arr.length;

        for(int i=0; i<size; i++){

            if((arr[i]%2)==0){
                System.out.print(arr[i]+" ");
            }
        }

        for(int i=0; i<size; i++){

            if((arr[i]%2)!=0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
