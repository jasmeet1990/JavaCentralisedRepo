package JavaPractice;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum;

		System.out.println("Fibonacci series is");
		for (int i=1;i<=10;i++) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		
		}

	}

}
