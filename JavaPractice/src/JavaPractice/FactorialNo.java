package JavaPractice;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		int fact =1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		int a = scan.nextInt();
		
		for(int i=1;i<=a;i++) {
		fact=  fact*i;

		}
		System.out.println("Factorial of a number is "+ fact);
	}

}
