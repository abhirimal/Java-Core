/*
    22.  Find the first non-repeating element in a given array of integers.
 */

package array;

public class FirstNonRepeatingNumber {

    public static void main(String[] args){

        int[] arr = {5,3,3,2,2,6,2,9,15,90,23,5,3,6,20};
        int size = arr.length;

        for(int i=0;i<size;i++){

            int count =0;

            for(int j=0;j<size;j++){

                if(arr[i]==arr[j]){
                    count++;
                }

            }

            if (count==1){
                System.out.println("The first non repeating element is "+arr[i]);
                break;
            }
        }
    }
}
