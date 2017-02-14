import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
    	
    	Scanner ana = new Scanner(System.in);

    	while(ana.hasNext()) {

    		boolean previousCharacterCapital = false;

    		String str = ana.nextLine();

    		char[] srtChar = str.toCharArray();

    		for(int i=0; i<srtChar.length; i++) {

    			if(previousCharacterCapital) {

    				if(srtChar[i]>='A' && srtChar[i]<='Z') {
    					srtChar[i] += 32;
    					previousCharacterCapital = false;
    				} else if(srtChar[i]!=' ') {
    					previousCharacterCapital = false;
    				}
    			} else if(!previousCharacterCapital) {

    				if(srtChar[i]>='a' && srtChar[i]<='z') {
    					srtChar[i] -= 32;
    					previousCharacterCapital = true;
    				} else if(srtChar[i]!=' ') {
    					previousCharacterCapital = true;
    				}
    			}
    		}

    		str = new String(srtChar);
    		System.out.println(str);
    	}	
    }
}