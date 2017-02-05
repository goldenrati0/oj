import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int[] numbers = new int[3];
        
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = ana.nextInt();
        }
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        
        allPossibleCombinations(numbers, resultList);
        
        int[] resultArray = new int[resultList.size()];
        
        for(int i = 0; i<resultArray.length; i++) {
            
            resultArray[i] = resultList.get(i);
        }
        
        Arrays.sort(resultArray);
        
        System.out.println(resultArray[resultArray.length - 1]);
    }
    
    private static void allPossibleCombinations(int [] numbers, ArrayList resultList) {
        
        resultList.add( (numbers[0] * numbers[1]) + numbers[2] );
        resultList.add( (numbers[0] + numbers[1]) * numbers[2] );
        resultList.add( (numbers[0] * numbers[1]) * numbers[2] );
        resultList.add( (numbers[0] + numbers[1]) + numbers[2] );
        
        resultList.add( numbers[0] * ( numbers[1] + numbers[2] ) );
        resultList.add( numbers[0] + ( numbers[1] * numbers[2] ) );
    }
}