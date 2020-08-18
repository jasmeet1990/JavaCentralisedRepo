package JavaPractice;

import java.util.Scanner;

public class tablePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value for which you want table to be printed");
		int a= scan.nextInt();
		int table=1;
				
		for(int i=1;i<=10;i++) {
			 table=a*i;
			System.out.println(a+" * "+i+ " = "+table);
		}
		
		
	}

}
