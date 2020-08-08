package JavaPractice;

import java.util.Scanner;
public class ScannerExp {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}
	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}
	public void div(int a, int b) {
		int c = a / b;
		System.out.println("Final Output is " + c);
	}

	public static void main(String[] args) {
		System.out.println("Expression is: (((((x1+x2)-x3)*x4)+x5)/x6)");
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter values of x");
		int x1 = s.nextInt();
		int x2 = s.nextInt();
		int x3 = s.nextInt();
		int x4 = s.nextInt();
		int x5 = s.nextInt();
		int x6 = s.nextInt();

		ScannerExp obj = new ScannerExp();
		int addres = obj.sum(x1, x2);
		int subres = obj.sub(addres, x3);
		int mulres = obj.mul(subres, x4);
		int sumres1 = obj.sum(mulres, x5);
		obj.div(sumres1, x6);
	}

}
