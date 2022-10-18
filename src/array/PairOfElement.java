/*
    38.  Write a java program to find all pairs of elements in an array whose sum
    is equal to a specified number.
 */

package array;

public class PairOfElement {

    public static void main(String[] args){

        int[] arr = {2,9,15,5,12,8,3};
        int size = arr.length;
        int num = 11;

        System.out.println("The pair of element whose sum is equal to "+num+" is:");

        for(int i=0; i<size; i++){

            for(int j=i+1; j<size; j++){

                if((arr[i]+arr[j])==num){
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }
    }
}
