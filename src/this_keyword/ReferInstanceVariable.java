/*
       ( WAP to illustrate the “this” keyword for following use case. )
       1. This can be used to refer current class instance variable.
 */

package this_keyword;

public class ReferInstanceVariable {

    // num1 and num2 are instance variable whose scope is within the class
    int num1, num2;

    public void num(int num1, int num2){ // num1 and num2 in this method parameters are local variable

        // this keyword is used to refer to the current class instance variable

        this.num1 = num1;
        this.num2 = num2;
    }

    public void calcSUm(){
        int sum = num1+num2;
        System.out.println("The sum is : "+sum);
    }

    public static void main(String[] args){

        // creating object
        ReferInstanceVariable obj = new ReferInstanceVariable();

        obj.num(5,10); //calling method num

        obj.calcSUm(); // calling method calcSum
    }



}
