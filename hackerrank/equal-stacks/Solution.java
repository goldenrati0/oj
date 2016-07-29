//https://www.hackerrank.com/challenges/equal-stacks
// Not done
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int firstStack = ana.nextInt();
		int secondStack = ana.nextInt();
		int thirdStack = ana.nextInt();

		int firstStackHeights[] = new int[firstStack];
		int secondStackHeights[] = new int[secondStack];
		int thirdStackHeights[] = new int[thirdStack];

		int firstStackHeight = 0;
		int secondStackHeight = 0;
		int thirdStackHeight = 0;

		for(int i=0; i<3; i++){

			if(i==0){

				for(int j=0; j<=firstStackHeights.length-1; j++){

					firstStackHeights[j] = ana.nextInt();
					firstStackHeight += firstStackHeights[j];
					// System.err.println("Updated firstStackHeight: " + firstStackHeight);
				}
			}else if(i==1){

				for(int j=0; j<=secondStackHeights.length-1; j++){

					secondStackHeights[j] = ana.nextInt();
					secondStackHeight += secondStackHeights[j];
					// System.err.println("Updated secondStackHeight: " + secondStackHeight);
				}
			}else if(i==2){

				for(int j=0; j<=thirdStackHeights.length-1; j++){

					thirdStackHeights[j] = ana.nextInt();
					thirdStackHeight += thirdStackHeights[j];
					// System.err.println("Updated thirdStackHeight: " + thirdStackHeight);
				}
			}
		}

		int minimumHeight = Math.min(Math.min(firstStackHeight, secondStackHeight), thirdStackHeight);
		// System.err.println("minimumHeight: " + minimumHeight);
		int maxStack = Math.max(Math.max(firstStack, secondStack), thirdStack);
		// System.err.println("maxStack: " + maxStack);

		for(int i=0; i<maxStack; i++){

			if(firstStackHeight>minimumHeight){

				firstStackHeight -= firstStackHeights[i];
				// System.err.println("Decreased firstStackHeight: " + firstStackHeight);

				if(firstStackHeight<minimumHeight){
					minimumHeight = firstStackHeight;
					// System.err.println("Updated minimumHeight: " + minimumHeight);
				}
			}

			if(secondStackHeight>minimumHeight){

				secondStackHeight -= secondStackHeights[i];
				// System.err.println("Decreased secondStackHeight: " + secondStackHeight);

				if(secondStackHeight<minimumHeight){
					minimumHeight = secondStackHeight;
					// System.err.println("Updated minimumHeight: " + minimumHeight);
				}
			}

			if(thirdStackHeight>minimumHeight){

				thirdStackHeight -= thirdStackHeights[i];
				// System.err.println("Decreased thirdStackHeight: " + thirdStackHeight);

				if(thirdStackHeight<minimumHeight){
					minimumHeight = thirdStackHeight;
					// System.err.println("Updated minimumHeight: " + minimumHeight);
				}
			}
		}

		System.out.println(minimumHeight);
	}
}