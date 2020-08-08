
public class ArithmeticOper1 {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int sub(int a, int b)	{
		int c = a-b;
		return c;
	}
	
	public int product(int a,int b) {
		int c = a*b;
		return c;
	}
	public void division(int a,int b) {
		int c = a/b;
		System.out.println("The final output is "+c);
		}

	public static void main(String[] args) {
		ArithmeticOper1 output = new ArithmeticOper1();
		System.out.println("Assignment 1: ((((10+2)+2)-2)*2/2)" );
		int addres = output.sum(10, 2);
		System.out.println("The result of first addition is "+addres);
		int addres1 = output.sum(addres, 2);
		System.out.println("The result of second addition is "+addres1);
		int subres = output.sub(addres1, 2);
		System.out.println("The result of subtraction is "+subres);
		int mulres = output.product(subres, 2);
		System.out.println("The result of multiplication is "+mulres);
		output.division(mulres, 2);
		
	
	}

}
