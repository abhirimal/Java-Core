package function;

import java.util.Scanner;

public class SumOfNumbers {

    public int calculateSum(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number.");
        a = input.nextInt();

        System.out.println("Enter second number.");
        b = input.nextInt();

        SumOfNumbers obj = new SumOfNumbers();
        int sum = obj.calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
