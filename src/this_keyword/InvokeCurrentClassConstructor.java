/*
       ( WAP to illustrate the “this” keyword for following use case. )
    3. this() can be used to invoke current class constructor.

 */

package this_keyword;

public class InvokeCurrentClassConstructor {

    int num;

    // default constructor
    InvokeCurrentClassConstructor() {
        System.out.println("This is default constructor ");
    }

    // parameterized constructor
    InvokeCurrentClassConstructor(int num) {
        // this() is used to invoke current class default constructor
        this();
        System.out.println("This is parameterized constructor. The num in parameter is " + num);
    }

    public static void main(String[] args) {
        // invoking parameterized constructor
        InvokeCurrentClassConstructor obj = new InvokeCurrentClassConstructor(5);

    }

}
