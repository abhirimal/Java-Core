package static_keyword;

/*
    What is the output of the following program?
public class AutoFare {

    private static final double MINIMUM_CHARGE = 16.0;
    protected static final double PRICE_PER_KM = 9.25;
    public static final double WAITING_CHARGE_PER_MIN = 0.50;

    public static void main(String[] args) {
        System.out.print(calculate(0.5, 12) + "@");
        System.out.print(calculate(12, 0) + "@");
        System.out.print(calculate(1, 200) + "@");
        System.out.print(calculate(8.25, 3) + "@");
    }

    private static int calculate(double kms, int minutes) {
        return Math.rint(Math.min(kms * PRICE_PER_KM + WAITING_CHARGE_PER_MIN, MINIMUM_CHARGE));
    }
}

    Ans:  It gives compilation error that we provided double in parameter and, it tries to return value as
    integer types. We can solve the problem by typecasting return to integer.

 */


