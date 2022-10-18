/*
    18. Move all the negative elements to one side of the array.
 */

package array;

public class MoveNegativeElements {

    public static void main(String[] args){

        int[] arr = {-1,5,7,-9,2,-15,-13};
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
