package conditionalstatements;

import java.util.Scanner;

public class CRUD {

    public static void main(String[] args) {

        int option, times;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any option. \n 1. CREATE \n 2. READ \n 3. UPDATE \n 4. DELETE");
        option = input.nextInt();
        System.out.println("Choose number of times you want to print it");
        times = input.nextInt();

        for (int i = 1; i <= times; i++) {

            int flag = 0;

            switch (option) {

                case 1:
                    System.out.println("CREATE");
                    break;

                case 2:
                    System.out.println("READ");
                    break;

                case 3:
                    System.out.println("UPDATE");
                    break;

                case 4:
                    System.out.println("DELETE");
                    break;

                default:
                    System.out.println("Try again");
                    flag++;
            }

            if (flag != 0) {
                break;
            }

        }
    }

}
