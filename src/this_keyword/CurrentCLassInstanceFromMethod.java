/*
       ( WAP to illustrate the “this” keyword for following use case. )
       6. this can be used to return the current class instance from the method

 */

package this_keyword;

public class CurrentCLassInstanceFromMethod {

    public void display(){
        // prints the reference id of current class object
        System.out.println(this);
    }

    public static void main(String[] args){
        CurrentCLassInstanceFromMethod obj = new CurrentCLassInstanceFromMethod();
        // prints the reference of object
        System.out.println(obj);
        // calling method display
        obj.display();
    }
}
