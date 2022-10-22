package function;

public class Sum {

    public int sum(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static void main(String[] args){

        Sum obj = new Sum();
        int total = obj.sum(5,51,9);
        System.out.println("The sum of three numbers is "+total);
    }
}
