package JavaInterview;

public class StringReverse {

	public static void main(String[] args) {

		String str1 = "I am new to automation testing";

		// Using StringBuilder
		StringBuilder str2 = new StringBuilder();

		str2.append(str1);

		str2 = str2.reverse();
		System.out.println("Reverse of original String is: "+str2);

	}

}
