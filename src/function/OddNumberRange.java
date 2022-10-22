/*
    11. WAP that displays all the odd numbers from range void
    displayOddNumbers(int start , int end)
 */

package function;

public class OddNumberRange {

    public void displayOddNumbers(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {

        OddNumberRange range = new OddNumberRange();

        // calling a method displayOddNumber
        range.displayOddNumbers(5, 21);

    }
}
