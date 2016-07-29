import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();

		for(int k=0; k<testCase; k++){

			int totalFarmer = ana.nextInt();
			int totalPremium = 0;
			ana.nextLine();

			for(int z=0; z<totalFarmer; z++){

				String x = ana.nextLine();

				Scanner ana2 = new Scanner(x);

				double areaOfLand = ana2.nextDouble(); //Double.parseDouble(x.charAt(0) + "");
				double totalAnimal = ana2.nextDouble(); //Double.parseDouble(x.charAt(2) + "");
				double envFriendliness = ana2.nextDouble(); //Double.parseDouble(x.charAt(4) + "");

				double calculation = Math.ceil(((areaOfLand/totalAnimal)*envFriendliness)*totalAnimal);

				totalPremium += (int)calculation;
			}

			System.out.println(totalPremium);
		}
	}
}