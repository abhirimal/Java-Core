/*
f. WAP to take two input coordinates x and y from  the user and find in which quadrant does the coordinate lie.
1. +x  +y  Q1
2. -x  +y  Q2
3. -x  -y  Q3
4. +x  -y  Q4

 */

package conditionalstatements;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args){

        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x coordinate ");
        x = input.nextInt();
        System.out.println("Enter y coordinates");
        y = input.nextInt();

        if(x>0 && y>0){
            System.out.println("It is Q1");
        }
        else if(x<0 && y>0){
            System.out.println("It is Q2");
        }
        else if(x<0 && y<0){
            System.out.println("It is Q3");
        }
        else if(x>0 && y<0){
            System.out.println("It is Q4");
        }
        else if (x==0 && y==0){
            System.out.println("It is origin");
        }
        else{
            System.out.println("Enter correct coordinates");
        }
    }
}
