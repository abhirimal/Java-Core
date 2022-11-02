/*
    29. Write a Java method to check whether a year (integer) entered by the user is a leap year or not
 */

package function;

import java.util.Scanner;

public class LeapYear {

    public boolean checkLeapyear(int year) {

        boolean check = false;

        // leap year is divisible by 4, but 100 is not a leap year, a year is leap year if it is
        // divisible by 400

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            check = true;
        } else {
            check = false;
        }

        return check;
    }

    public static void main(String[] args) {

        // taking year input from a user
        System.out.println("Enter a year.");
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        // creating an object of LeapYear class.
        LeapYear leapYear = new LeapYear();

        // calling the function checkLeapYear and storing its boolean return in check
        boolean check = leapYear.checkLeapyear(year);

        //printing out results based on 2 conditions
        if (check) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
