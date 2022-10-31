/*
    27. Write a method to generate a random number.
 */

package function;

public class Random {

    public void printRandomNumber() {
        double random = Math.random();
        System.out.println("The random number is " + random);
    }

    public static void main(String[] args) {

        Random random = new Random();
        random.printRandomNumber();
    }
}
