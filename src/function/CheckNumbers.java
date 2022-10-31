package function;

public class CheckNumbers {

    public boolean isSameNum(int num1, int num2) {

        if (num1 == num2) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        CheckNumbers checkNumbers = new CheckNumbers();

        boolean check = checkNumbers.isSameNum(5, 5);
        System.out.println(check);

    }
}
