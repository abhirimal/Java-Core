/*
       ( WAP to illustrate the “this” keyword for following use case. )
    5. this can be passed as an argument in the constructor call.
    this can be used to return the current class instance from the method

 */
package this_keyword;

public class ArgumentInConstructorCall {

    String name="Ram Sharma";
    String location = "Pokhara";

    public ArgumentInConstructorCall(){
        Example1 obj = new Example1(this);
        obj.display();
    }

    public static void main(String[] args){
        ArgumentInConstructorCall obj2= new ArgumentInConstructorCall();
    }
}

class Example1 {
    ArgumentInConstructorCall obj2;

    public Example1(ArgumentInConstructorCall obj2){
        this.obj2 = obj2;
    }

    public void display(){
        System.out.println("The name of the student is "+obj2.name);
        System.out.println("The name of the location is "+obj2.location);
    }


}
