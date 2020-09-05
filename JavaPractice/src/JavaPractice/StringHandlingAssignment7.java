package JavaPractice;

import java.util.Scanner;

public class StringHandlingAssignment7 {
	// This program is to find occurence of word in a String

	public static void main(String[] args) {
		String s1 = "My name my name is Jasmeet Kaur";
	
		String s3[] = s1.split(" ");
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String findword = scan.next();

		for (int i = 0; i < s3.length; i++) {
			String word = s3[i];
			System.out.print(word+" ");
			if (word.equalsIgnoreCase(findword)) {
				count = count + 1;
			}
		}
		System.out.println();
		System.out.println("Occurence of word " + findword + " is " + count);
	}

}
