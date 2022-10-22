/*
    7. Create a function called averageNumber(int num1 , int num2 , int num3)  and inside the
    function display the highest and lowest among three numbers.
 */

package function;

public class HighestLowestNumber {

    //declaring a method averageNumber
    public void averageNumber(int num1, int num2, int num3) {

        // condition for highest number
        if (num1 > num2 && num1 > num3) {
            System.out.println("The highest number is " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The highest number is " + num2);
        } else {
            System.out.println("The highest number is " + num3);

        }

        //condition for lowest number
        if (num1 < num2 && num1 < num3) {
            System.out.println("The lowest number is " + num1);
        } else if (num2 < num3 && num2 < num1) {
            System.out.println("The lowest number is " + num2);

        } else {
            System.out.println("The lowest number is " + num3);
        }
    }

    public static void main(String[] args) {

        //creating a object of HighestLowestNumber class
        HighestLowestNumber obj = new HighestLowestNumber();

        //calling a method averageNumber from object obj
        obj.averageNumber(18, 5, 12);
    }
}
