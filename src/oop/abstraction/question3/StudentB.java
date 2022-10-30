package oop.abstraction.question3;

import jdk.jfr.Percentage;

public class StudentB extends Marks {

    double percentage;

    StudentB(double sub1, double sub2, double sub3, double sub4) {
        percentage = (sub1 + sub2 + sub3 + sub4) / 4;
    }

    public void getPercentage() {
        System.out.println("The percentage obtained by student B is : " + percentage);
    }
}
