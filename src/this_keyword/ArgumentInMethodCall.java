/*
       ( WAP to illustrate the “this” keyword for following use case. )
    4. this can be passed as an argument in the method call.

 */

package this_keyword;

public class ArgumentInMethodCall {

    String name="Ram Sharma";
    String location="Pokhara";

    public void display(){
        Example obj = new Example();
        obj.getData(this);
        obj.showData();
    }

    public static void main(String[] args){
        ArgumentInMethodCall currentStudent = new ArgumentInMethodCall();
        currentStudent.display();
    }
}

class Example{
    ArgumentInMethodCall student = new ArgumentInMethodCall();

    public void getData(ArgumentInMethodCall student){
        this.student = student;
    }

    public void showData(){
        System.out.println("The name of the student is "+student.name);
        System.out.println("The location of the student is "+student.location);
    }
}
