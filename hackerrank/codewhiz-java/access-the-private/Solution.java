	import java.io.*;
	import java.lang.reflect.*;
	import java.util.*;
	import java.util.regex.*;


	public class Solution {

		public static void main(String[] args) throws Exception {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int num=Integer.parseInt(br.readLine().trim());
			Object o;
			
			//solve -- START
			Solution.Private sdp = new Solution().new Private();
			o = sdp;
			System.out.println(num + " is " + sdp.powerof2(num));
			//solve -- END

			System.out.println("An instance of class: "+o.getClass().getSimpleName()+" has been created");
		}//end of main
	  	class Private
	 	{
	       private String powerof2(int num)
	 	   {
	           return ((num&num-1)==0)?"power of 2":"not a power of 2";
	       }
	  	}//end of Privtate
	}//end of solution