/*
    5.What will be the output of the following program?
 */
package static_keyword;

public class FireAlarm {
    public static void main(String[] args) {
        double d[] = {2.3, 3.4, 4.5};
        p(d);
        modify(d);
        p(d);
        modify2(d);
        p(d);
        modify(d);
        p(d);
    }

    private static void p(double[] d) {
        System.out.print("{");
        for (double d1 : d) {
            System.out.print(d1 + ",");
        }
        System.out.print("},");
    }

    private static void modify(double[] d) {
        d[0] = d[1];
        d[1] = d[2];
        d[2] = d[0];
    }

    private static void modify2(double[] d) {
        d = new double[3];
        d[0] = d[1] = d[2] = 1.0;
    }
}

/*
    Ans: The output of this program is :
        {2.3,3.4,4.5,},{3.4,4.5,3.4,},{3.4,4.5,3.4,},{4.5,3.4,4.5,}
 */
