package oop.abstraction.question3;

public class StudentA extends Marks {

    double percentage;

    public StudentA(double sub1, double sub2, double sub3) {
        percentage = (sub1 + sub2 + sub3) / 3;

    }

    @Override
    public void getPercentage() {
        System.out.println("The percentage obtained by student A is : " + percentage);
    }
}
