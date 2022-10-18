/*
    35. Write a java program to find the duplicate values of an array of string values.
 */

package array;

public class FindDuplicateString {

    public static void main(String[] args){

        String[] names = {"Abhiyan","Anurag","Ramesh","Nabin","Bimal","Abhiyan"};
        int size = names.length;

        for(int i=0; i<size; i++){
            String toCompare = names[i];

            for(int j=i+1; j<size; j++){

                if(toCompare.equals(names[j])){

                    System.out.println("Duplicate names "+ toCompare);
                }
            }
        }
    }
}
