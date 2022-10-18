/*
    28. Find the Union and Intersection of the two sorted arrays.
 */
package array;

public class UnionAndIntersection {

    public static void main(String[] args){
        int[] arr1 = {4,9,15,32,60,78};
        int size1 = arr1.length;
        int[] arr2 = {3,6,9,32,70};
        int size2 = arr2.length;

        // intersection

        System.out.println("The intersection of the two sorted array is");
        for(int i=0; i<size1; i++){

            for(int j=0; j<size2; j++){

                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
