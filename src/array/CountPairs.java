/*
    Count pairs with given sum
    Example:
    Input:
    N = 4, K = 6
    arr[] = {1, 5, 7, 1}
    Output: 2
    Explanation:
    arr[0] + arr[1] = 1 + 5 = 6
    and arr[1] + arr[3] = 5 + 1 = 6.

 */

package array;

public class CountPairs {

    public static void main(String[] args){

        int[] arr = {2,9,15,5,12,8,3};
        int size = arr.length;
        int sum = 11;
        int count =0;

        System.out.println("The pair of element whose sum is equal to "+sum+" is:");

        for(int i=0; i<size; i++){

            for(int j=i+1; j<size; j++){

                if((arr[i]+arr[j])==sum){
                    System.out.println(arr[i] +" "+arr[j]);
                    count++;
                }
            }
        }

        System.out.println("There are "+count+" pair of elements whose sum is equal to "+sum);

    }
}
