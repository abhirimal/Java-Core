/*
     21. Find the first repeating element in an array of integers.
 */

package array;

public class FirstRepeatingNumber {

    public static void main(String[] args){

        int[] arr = {5,8,5,8,9,3,90,4};
        int size = arr.length;

        for(int i =0;i<size; i++){

            int count =1;

            for(int j=i+1;j<size; j++){

                if(arr[i]==arr[j]){
                    System.out.println("The first repeating number is "+ arr[j]);
                    count++;
                    break;
                }
            }

            if(count>1){
                break;
            }
        }
    }
}
