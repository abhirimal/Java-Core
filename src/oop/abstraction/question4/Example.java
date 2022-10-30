package oop.abstraction.question4;

public abstract class Example {

    public Example(){
        System.out.println("This is constructor of abstract class.");
    }

    public abstract void a_method();

    public void b_method(){
        System.out.println("This is a normal method of abstract class.");
    }
}
