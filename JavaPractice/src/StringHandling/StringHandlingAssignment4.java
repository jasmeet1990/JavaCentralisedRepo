package StringHandling;

public class StringHandlingAssignment4 {

	public static void main(String[] args) {
		String s1 ="My name is Jasmeet Kaur";
		
	String reverse="";
		int l =s1.length();
		System.out.println(l);
		
		for(int i=l-1;i>=0;i--) {
			reverse = reverse +s1.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
