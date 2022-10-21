/*
    5. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to
    find out if he/she is eligible to vote.
 */

package function;

public class Vote {

    public void checkEligibility(int age) {

        if (age >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("Sorry. You are not eligible for voting");
        }
    }

    public static void main(String[] args) {

        Vote obj = new Vote();
        obj.checkEligibility(21);

    }
}
