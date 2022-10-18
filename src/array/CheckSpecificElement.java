/*
    42. Write a java program to check if an array of integers contains two specific elements 65 and 77.

 */

package array;

public class CheckSpecificElement {

    public static void main(String[] args){

        int[] arr = {21,64,65,12,9,77,81,10,65,77};
        int size = arr.length;
        int signal1=0,signal2=0;

        for(int i=1; i<size; i++){

            if(arr[i]==65){
                System.out.println("65 is found at index "+ i);
                signal1++;
            }

        }

        for(int i=1; i<size; i++){

            if(arr[i]==77){
                System.out.println("77 is found at index "+ i);
                signal2++;
            }
        }

        if(signal1>=1 && signal2>=1){

            System.out.println("65 and 77 are found in the given array");

        } else if (signal1>=1 && signal2==0) {

            System.out.println("Only 65 is found in thr given array");

        } else if(signal1==0 && signal2>=1){

            System.out.println("Only 77 is found in the given array.");

        }

        else{

            System.out.println("65 and 77 are not found in the given array");

        }

    }
}
