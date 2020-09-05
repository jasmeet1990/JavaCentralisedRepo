package JavaPractice;

public class StringHandlingAssignment8 {

	public static void main(String[] args) {
		String s1="101010101010";
		System.out.println("String "+s1);
		String ones="";
		String zeroes="";
		
		for (int i=0;i<s1.length();i++) {
			s1.charAt(i);
			if(s1.charAt(i)== '1') {
				ones =ones+s1.charAt(i);
			}
			else {
				zeroes=zeroes+s1.charAt(i);
			}
				
		}
				System.out.println();
      System.out.print("Output is " + ones + zeroes);
   
	

}
}
