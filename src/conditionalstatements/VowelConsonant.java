/*
    a. Write a program to take a character input from a keyboard and print whether it is vowel or consonant.
 */

package conditionalstatements;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args){

        char a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        a = input.next().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a=='o' || a=='u' ){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is a consonant");
        }
    }
}
