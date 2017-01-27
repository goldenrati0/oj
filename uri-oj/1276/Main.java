import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);
        
        while (ana.hasNext()) {

            String x = ana.nextLine();
            StringBuilder output = new StringBuilder("");
            
            if(x.equals("") || x == null) {
                System.out.println();
                continue;
            }
            
            x = x.replace(" ", "");

            ArrayList<Character> uniqueChar = new ArrayList<Character>();

            for (char temp : x.toCharArray()) {

                if (!uniqueChar.contains(temp)) {
                    uniqueChar.add(temp);
                }
            }

            char[] uniqueArray = new char[uniqueChar.size()];

            for (int i = 0; i < uniqueChar.size(); i++) {
                uniqueArray[i] = uniqueChar.get(i);
            }

            Arrays.sort(uniqueArray);

            for (int i = 0; i < uniqueArray.length; i++) {

                int index = sequence(uniqueArray, i);
                output.append(uniqueArray[i] + ":" + uniqueArray[index] + ", ");

                i = ++index;
                i--;
            }

            System.out.println(output.substring(0, output.length() - 2));
        }
    }

    public static int sequence(char[] uniqueArray, int startIndex) {

        int i = startIndex;
        for (; i < uniqueArray.length - 1; i++) {

            if (uniqueArray[i] + 1 != uniqueArray[i + 1]) {

                return i;
            }
        }

        return i;
    }
}
