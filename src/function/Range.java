/*
    10. WAP that displays all the numbers from range void display(int start , int end)
 */
package function;

import java.util.Scanner;

public class Range {


    public void displayRange(int start, int end) {

        //loop that prints number from start to end
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Range range = new Range();

        //calling a function
        range.displayRange(5, 10);

    }
}
