/*
    12. WAP that check a prime number boolean checkPrime(int testNumber)

 */

package function;

import java.util.Scanner;

public class CheckPrimeNumber {

    public boolean checkPrime() {

        int n, count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        //prime number is only divisible by 1 and itself. So, if the number is prime then
        // the count will be 2, non-prime numbers will have count more than 2

        if (count == 2) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {

        CheckPrimeNumber obj = new CheckPrimeNumber();

        System.out.println(obj.checkPrime());

    }

}
