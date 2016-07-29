import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();

		String star = "*";
		String dot = ".";

		for(int testCase_i=0; testCase_i<testCase; testCase_i++){

			int row = ana.nextInt();
			int column = ana.nextInt();

			if(column == 1){

				while(row>0){
					System.out.println(star);
					row--;
				}
			}

			if(column%2 == 0 || column %2 != 0){

				for(int i=1; i<=row; i++){

					if(i==1 || i==row){

						for(int j=1; j<=column; j++){
							System.out.print(star);
						}
						System.out.println();
					}else{

						for(int j=1; j<=column; j++){

							if(j==1 || j==column){
								System.out.print(star);
							}else{
								System.out.print(dot);
							}
						}
						System.out.println();
					}
				}
			}else{


			}
		}
	}
}