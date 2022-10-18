package operators;

//1. Write a program to take name input from the user and display Hello + name as output.

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Hello "+name);
    }
}
