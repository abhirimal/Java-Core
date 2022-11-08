/*
       ( WAP to illustrate the “this” keyword for following use case. )
    2. this can be used to invoke current class method (implicitly)
 */

package this_keyword;

public class InvokeCurrentClassMethod {

    public void display() {
        System.out.println("Inside display method");
    }

    public void print() {
        // this.display is same as only using display()
        this.display();
        System.out.println("Inside print method");
    }

    public static void main(String[] args){
        InvokeCurrentClassMethod a = new InvokeCurrentClassMethod();
        a.print();
    }
}