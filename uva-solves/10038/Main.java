import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {

    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        while (ana.hasNextInt()) {

            int n = ana.nextInt();
            int s = ana.nextInt();

            if (n == 1) {
                System.out.println("Jolly");
                continue;
            }

            int[] numbers = new int[n];
            numbers[0] = s;

            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = ana.nextInt();
            }
            /* input processing completed */

            int[] diff = new int[numbers.length - 1];

            for (int i = 0; i < diff.length; i++) {
                diff[i] = Math.abs(numbers[i] - numbers[i + 1]);
            }
            Arrays.sort(diff);

            /*for (int val : diff) {
            System.out.print(val + " ");
        }*/
            if (maintainSequence(diff, n)) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }

    private static boolean maintainSequence(int[] diff, int n) {

        if (diff[diff.length - 1] != n - 1) {
            return false;
        }

        for (int i = 0; i < diff.length - 1; i++) {
            int temp = diff[i + 1] - diff[i];

            if (temp != 1) {
                return false;
            }
        }

        return true;
    }
}
