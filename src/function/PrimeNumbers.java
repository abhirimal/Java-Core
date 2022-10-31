/*
    13. WAP that displays all the prime numbers between 1 and 1000. Use the above checkPrime
    function to identify the prime number.
 */

package function;

public class PrimeNumbers {

    public void displayPrime() {

        for (int i = 1; i <= 1000; i++) {
            CheckPrimeNumber check = new CheckPrimeNumber();
            check.checkPrime(i);

            if (check.checkPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.displayPrime();
    }
}
