/*
    9. WAP to check whether a number is even or odd using function. The function name should be
    isEven(int parameter), which returns true if the number is even and return false if the
    number is  odd.
 */

package function;

public class CheckEvenOdd {

    public boolean isEven(int num){

        //checking if the number is even or odd
        if(num%2==0){
            return true;
        }

        else{
            return false;
        }

    }


    public static void main(String[] args){

        CheckEvenOdd obj = new CheckEvenOdd();

        // saving the value returned by function in variable result
        boolean result = obj.isEven(6);

        //displaying the result
        System.out.println(result);

    }
}
