/*
    9. Write a java program to find the average of 5 numbers.
 */

package operators;

public class Average {

    public static void main(String[] args){

        int num1 =10, num2=12, num3=7, num4=15, num5=22;
        int sum = num1+num2+num3+num4+num5;
        double average = sum/5;

        System.out.println("The average of 5 number is "+ average);
    }
}
