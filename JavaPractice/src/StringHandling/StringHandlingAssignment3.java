package StringHandling;

public class StringHandlingAssignment3 {
	
	//Input = My name is Jasmeet Kaur
	//Output = yM eman si teemsaJ ruaK

	public static void main(String[] args) {
		String s1 = "My name is Jasmeet Kaur";
		String s2[] = s1.split(" ");
		int l =s2.length;
		
		
		String word="";
		String revString="";
		
		for (int i = 0; i <= l - 1; i++) {
			word = s2[i];
			String reverse = "";
			System.out.print(word + " ");
			
			
			for (int j = word.length() - 1; j >= 0; j--) {
				reverse = reverse + word.charAt(j);

			}
			revString = revString+reverse + " ";
		}
		System.out.println();
	System.out.println(revString);
}
}
