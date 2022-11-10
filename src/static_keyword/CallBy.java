/*
    4. What will be the output of the following program.
 */

package static_keyword;

public class CallBy {
    static void execute(Byte x, Byte y) {
        System.out.println("execute, execute");
    }
    static void execute(Byte x, Byte y, Byte z) {
        System.out.println("execute, execute, execute");
    }
    static void execute(byte... x) {
        System.out.println("execute");
    }
    public static void main(String[] args) {
        byte b = 5;
        execute(b);
        execute(b, b);
        execute(b, b, b);
        execute(b, b, b, b);
    }
}

/*
    Ans: The output of the above code is :
    execute
    execute, execute
    execute, execute, execute
    execute
 */
