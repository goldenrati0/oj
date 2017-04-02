import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by tahmid on 4/1/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        int n = ana.nextInt();
        int m = ana.nextInt();
        ana.nextLine();

        LinkedHashMap<String, Integer> wordIndexPair = new LinkedHashMap<>();
        String pairedWords[][] = new String[m][2];
        for (int i = 0; i < m; i++) {

            String words[] = ana.nextLine().trim().split(" ");
            wordIndexPair.put(words[0], i);
            wordIndexPair.put(words[1], i);

            pairedWords[i][0] = words[0];
            pairedWords[i][1] = words[1];
        }
        /*input complete*/

        StringBuilder result = new StringBuilder("");
        String lectureWords[] = ana.nextLine().trim().split(" ");

        for (int i = 0; i < lectureWords.length; i++) {

            int index = wordIndexPair.get(lectureWords[i]);
            if (pairedWords[index][0].length() <= pairedWords[index][1].length())
                result.append(pairedWords[index][0] + " ");
            else
                result.append(pairedWords[index][1] + " ");
        }

        System.out.println(result.toString().trim());
    }
}
