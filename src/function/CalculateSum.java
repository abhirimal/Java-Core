/*
    2. Write a program with a method named getTotal that accepts two integers as an argument and
    return its sum. Call this method from main( ) and print the results.
 */

package function;

public class CalculateSum {

    public int add(int a, int b){
        int sum;
        sum =a+b;
        return sum;
    }

    public static void main(String[] args){

        CalculateSum calc = new CalculateSum();
        int result = calc.add(5,10);
        System.out.println(result);
    }
}
