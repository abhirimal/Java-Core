package oop.abstraction.question3;

public class MainClass {

    public static void main(String[] args) {

        StudentA a = new StudentA(80.0, 90.0, 85.0);
        a.getPercentage();

        StudentB b = new StudentB(80.0, 90.0, 85.0, 95.0);
        b.getPercentage();

    }
}
