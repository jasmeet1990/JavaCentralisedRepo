package StringHandling;

public class StringAssignment2 {

	public static void main(String[] args) {
		String s1 ="My name is Jasmeet Kaur";
		String[] s2 = s1.split(" ");
	
		int l =s2.length;
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
		
		
	}

}
