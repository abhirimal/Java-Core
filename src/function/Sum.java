/*
    8. Create a function called sum(int num1 , int num2 , int num3)  and inside the
       function return the sum of three numbers and display it in the part from where
       the function was called.
 */

package function;

public class Sum {

    //declaring a function
    public int sum(int num1, int num2, int num3){

        //returning total of three numbers
        return num1+num2+num3;
    }

    public static void main(String[] args){

        //creating object of Sum class
        Sum obj = new Sum();
        int total = obj.sum(5,51,9);
        System.out.println("The sum of three numbers is "+total);
    }
}
