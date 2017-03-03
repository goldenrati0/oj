import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by tahmid on 3/4/17.
 */
public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> characterToDigit = new LinkedHashMap<>();
        createLinkedHashTable(characterToDigit);

        Scanner ana = new Scanner(System.in);

        while (ana.hasNext()) {

            String in = ana.nextLine();
            StringBuilder output = new StringBuilder("");

            for (int i = 0; i < in.length(); i++) {
                if (in.codePointAt(i) >= 65 && in.codePointAt(i) <= 90)
                    output.append(characterToDigit.get(in.charAt(i)));
                else
                    output.append(in.charAt(i));
            }

            System.out.println(output.toString());
        }
    }

    private static void createLinkedHashTable(LinkedHashMap<Character, Integer> characterToDigit) {

        characterToDigit.put('A', 2);
        characterToDigit.put('B', 2);
        characterToDigit.put('C', 2);
        characterToDigit.put('D', 3);
        characterToDigit.put('E', 3);
        characterToDigit.put('F', 3);
        characterToDigit.put('G', 4);
        characterToDigit.put('H', 4);
        characterToDigit.put('I', 4);
        characterToDigit.put('J', 5);
        characterToDigit.put('K', 5);
        characterToDigit.put('L', 5);
        characterToDigit.put('M', 6);
        characterToDigit.put('N', 6);
        characterToDigit.put('O', 6);
        characterToDigit.put('P', 7);
        characterToDigit.put('Q', 7);
        characterToDigit.put('R', 7);
        characterToDigit.put('S', 7);
        characterToDigit.put('T', 8);
        characterToDigit.put('U', 8);
        characterToDigit.put('V', 8);
        characterToDigit.put('W', 9);
        characterToDigit.put('X', 9);
        characterToDigit.put('Y', 9);
        characterToDigit.put('Z', 9);
    }
}