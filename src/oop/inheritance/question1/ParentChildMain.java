package oop.inheritance.question1;

public class ParentChildMain {

    public static void main(String[] args){

        ParentClass p1 = new ParentClass();
        p1.displayParent();

        ChildClass c1 = new ChildClass();
        c1.displayChild();

        c1.displayParent();

    }
}
