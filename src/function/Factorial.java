/*
    Write a program to print the factorial of a number by defining a method getFactorial(int number).
 */

package function;

public class Factorial {

    public void getFactorial(int number){
       int fact = 1;
        for(int i=1; i<number+1; i++){
            fact = fact*i;
        }

        System.out.println("The factorial of the number is "+fact);
    }

    public static void main(String[] args){

        Factorial obj = new Factorial();
        obj.getFactorial(5);
    }
}
