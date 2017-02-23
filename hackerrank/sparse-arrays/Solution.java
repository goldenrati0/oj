import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> allStrings = new ArrayList<>();

        Scanner ana = new Scanner(System.in);

        int numberOfStrings = ana.nextInt();
        ana.nextLine();

        int counter[] = new int[numberOfStrings];

        for(int i=0; i<numberOfStrings; i++) {
            String string = ana.nextLine();

            if(allStrings.contains(string)) {
                int index = allStrings.indexOf(string);
                counter[index] += 1;
            } else {
                allStrings.add(string);
                int index = allStrings.indexOf(string);
                counter[index] += 1;
            }
        }

        int numberofQueries = ana.nextInt();
        ana.nextLine();

        for(int i=0; i<numberofQueries; i++) {
            String quries = ana.nextLine();

            if(allStrings.contains(quries)) {
                int index = allStrings.indexOf(quries);
                System.out.println(counter[index]);
            } else {
                System.out.println(0);
            }
        }
    }
}