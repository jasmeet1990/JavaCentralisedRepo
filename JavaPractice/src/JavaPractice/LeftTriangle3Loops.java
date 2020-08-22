package JavaPractice;

public class LeftTriangle3Loops {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--) 
		{
			for(int k=1;k<=(i-1);k++) 
			{
				System.out.print(" ");
			}
				for(int j=5;j>=i;j--) {
					System.out.print("*");
					
				}
				
			
			System.out.println();
		}

	}

}
