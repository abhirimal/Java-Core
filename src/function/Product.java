/*
    3. Define a method that returns the product of two numbers entered by the user.
 */

package function;

import java.util.Scanner;

public class Product {

    public void calculateProduct(){

        int a,b,product;

        System.out.println("Welcome to Special Calculator that only performs multiplication");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number.");
        a = input.nextInt();
        System.out.println("Please enter second number. ");
        b = input.nextInt();

        product = a * b;

        System.out.println("The product of "+a+" and "+b+" is "+product);
    }

    public static void main(String[] args){

        Product product = new Product();
        product.calculateProduct();

    }
}
