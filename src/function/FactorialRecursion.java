/*
    24. Write a method to find factorial using recursion.
 */

package function;

public class FactorialRecursion {

    public int fact(int n){
        if(n==1){
            return 1;
        }

        else{
            return n*(n-1);
        }
    }

    public static void main(String[] args){

        FactorialRecursion obj = new FactorialRecursion();
        int factorial = obj.fact(9);
        System.out.println("The factorial is "+factorial);
    }
}
