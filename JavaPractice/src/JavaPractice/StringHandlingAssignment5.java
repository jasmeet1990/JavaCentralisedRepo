package JavaPractice;

import java.util.Scanner;

public class StringHandlingAssignment5 {

	// This program is to Find occurence of character in String "My name is Jasmeet kaur"

	public static void main(String[] args) {
		String s1 = "My name is Jasmeet Kaur";
		String s2 = s1.toLowerCase();
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the character");
		char ch = scan.next().charAt(0);

	for (int i = 0; i < s2.length(); i++) {
		char word = s2.charAt(i);
		System.out.print(word);
		
			if (word == ch) {
				count = count + 1;
			}
			
		}
	System.out.println();
	System.out.println("Occurence of "+ch+" is " + count);
	}

}
