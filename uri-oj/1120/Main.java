import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner ana = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<Character>();

        while(true) {

        	int d = ana.nextInt();
        	// ana.next();
        	String n = ana.nextLine();
        	n = n.trim();
/*
        	System.out.println("Debug==>" + d);
        	System.out.println("Debug==>" + n);*/

        	list = new ArrayList<Character>();

        	if(d==0 && n.equals("0")) {
        		break;
        	}

        	Character dc = String.valueOf(d).charAt(0);

        	for(int i=0; i<n.length(); i++){

        		list.add((Character)n.charAt(i));
        	}

        	while(list.contains(dc)) {

        		list.remove(dc);
        	}

        	Object[] temp = list.toArray();

        	char[] x = new char[temp.length];

        	// System.arraycopy(temp, 0, x, 0, temp.length);

        	for(int i=0; i<temp.length; i++) {

        		x[i] = (char) temp[i];
        	}

        	// System.out.println("Debug==>" + new String(x));

        	if(!isAllZero(x) && !isArrayNull(x)) {
/*
        		char[] v = new char[x.length];
        		System.arraycopy(x, 0, v, 0, x.length);*/

        		System.out.println(removeLeadingZero(new String(x)));
        	}else{
        		System.out.println(0);
        	}


        }
 
    }

    public static boolean isAllZero(char[] x) {

    	// boolean flag = true;

    	for(int i=0; i<x.length; i++) {

    		if(x[i] != '0') {

    			return false;
    		}
    	}

    	return true;
    }

    public static boolean isArrayNull(char[] x) {

    	// boolean flag = true;

    	if(x != null) {
    		return false;
    	}

    	return true;
    }

    public static String removeLeadingZero(String temp) {

    	char x[] = temp.toCharArray();

    	int breakPoint = 0;

    	for(int i=0; i<x.length; i++) {

    		if(x[i] != '0') {

    			breakPoint = i;
    			break;
    		}
    	}

    	String v = "";

    	for(int i=breakPoint; i<x.length; i++) {

    		v += x[i];
    	}

    	return v;
    }
 
}