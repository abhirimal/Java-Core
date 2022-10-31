/*
    12. WAP that check a prime number boolean checkPrime(int testNumber)

 */

package function;

import java.util.Scanner;

public class CheckPrimeNumber {

    boolean checkPrime(int testNumber) {

        int count = 0;


        for (int i = 1; i <= testNumber; i++) {

            if (testNumber % i == 0) {
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

        System.out.println(obj.checkPrime(5));

    }

}
