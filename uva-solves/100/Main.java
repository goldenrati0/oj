import java.util.Scanner;

public class Main {

    private static int cycleLengts[];

    public static void main(String[] args) {
        cycleLengts = new int[1000000];
        Scanner ana = new Scanner(System.in);
        int a, b, from, to, maximumIter;

        while (ana.hasNext()) {
            a = ana.nextInt();
            b = ana.nextInt();
            if (a > b) {
                from = b;
                to = a;
            } else {
                from = a;
                to = b;
            }
            maximumIter = cycLength(from);
            for (int i = from + 1; i <= to; i++) {
                maximumIter = Math.max(maximumIter, cycLength(i));
            }
            System.out.printf("%d %d %d\n", a, b, maximumIter);
        }
    }

    private static int cycLength(int num) {
        if (num == 1) return 1;

        if (num < cycleLengts.length
                && cycleLengts[num] != 0) return cycleLengts[num];

        int length = 1 + cycLength(nextNumber(num));
        if (num < cycleLengts.length)
            cycleLengts[num] = length;
        return length;
    }

    private static int nextNumber(int num) {
        if (num % 2 == 0)
            return num / 2;
        return (3 * num) + 1;
    }
}