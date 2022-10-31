/*
    18. Define two methods to print the maximum and minimum number respectively
        among three numbers entered by the user.
 */

package function;

import java.util.Scanner;

public class MaxMin {

    public void maxNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println("The maximum number is "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The maximum number is "+num2);
        } else {
            System.out.println("The maximum number is "+num3);
        }

    }

    public void minNum(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            System.out.println("The minimum number is "+num1);
        } else if (num2 < num3 && num2 < num1) {
            System.out.println("The minimum number is "+num2);
        } else {
            System.out.println("The minimum number is "+num3);
        }
    }

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        MaxMin maxMin = new MaxMin();
        maxMin.maxNumber(num1, num2, num3);
        maxMin.minNum(num1, num2, num3);
    }
}
