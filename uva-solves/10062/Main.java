import java.util.Scanner;

/**
 * Created by tahmid on 3/4/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);
        while (ana.hasNext()) {

            String str = ana.nextLine();
            int ascii[] = new int[130];
            int strLength = str.length();

            for (int i = 0; i < strLength; i++) {
                ascii[(int) str.charAt(i)] += 1;
            }

            int maxValue = 0;
            for (int i = 0; i < ascii.length; i++) {
                if (ascii[i] > maxValue)
                    maxValue = ascii[i];
            }

            for (int i = 1; i <= maxValue; i++) {
                for (int j = ascii.length - 1; j >= 0; j--) {
                    if (ascii[j] == i) {
                        System.out.println(j + " " + ascii[j]);
                        ascii[j] = 0;
                    }
                }
            }
            if(ana.hasNext()) System.out.println();
        }
    }
}