import java.util.Scanner;

/**
 * Created by tahmid on 4/1/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        while (ana.hasNext()) {

            int n = ana.nextInt();

            if (n < 0) {
//                System.out.println("Underflow!");
                int temp = n * (-1);

                if (temp % 2 == 0)
                    System.out.println("Underflow!");
                else
                    System.out.println("Overflow!");
            } else if (n < 8)
                System.out.println("Underflow!");
            else if (n > 13)
                System.out.println("Overflow!");
            else
                System.out.println(factorial(n));
        }
    }

    private static long factorial(int n) {

        switch (n) {
            case 8:
                return 40320;
            case 9:
                return 362880;
            case 10:
                return 3628800;
            case 11:
                return 39916800;
            case 12:
                return 479001600;
            case 13:
                return 6227020800L;
        }

        return 1;
    }
}
