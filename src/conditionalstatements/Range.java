/*
    d. Take two values fromNumber and toNumber. Your program should print based on following criteria
        -Both fromNumber and toNumber should be greater than or equal to 0.
        -If fromNumber is less than toNumber then print all the numbers from fromNumber to toNumber ; inclusive fromNumber and exclusive toNumber
       -If fromNumber is greater than toNumber, swap the numbers and perform the same process as above.
 */

package conditionalstatements;

import java.util.Scanner;

public class Range {

    public static void main(String[] args){

        int fromNumber, toNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a starting number. The number should be positive.");
        fromNumber = input.nextInt();
        System.out.println("Enter a ending number. The number should be positive.");
        toNumber = input.nextInt();

        if(fromNumber>0 && toNumber>0){
            for(int i=fromNumber; i<=toNumber; i++){
                System.out.println(i);
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
