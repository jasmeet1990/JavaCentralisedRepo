
public class ArithmeticOper2 {

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
		ArithmeticOper2 output = new ArithmeticOper2();
		System.out.println("Assignment 2: ((((10-2)+2)-2)*2)/2)" );
		
		int subres = output.sub(10, 2);
		System.out.println("The result of first subtraction is "+subres);
		int addres = output.sum(subres, 2);
		System.out.println("The result of first addition is "+addres);
	
		int subres1 = output.sub(addres, 2);
		System.out.println("The result of second subtraction is "+subres1);
	
		int mulres = output.product(subres1, 2);
		System.out.println("The result of multiplication is "+mulres);
		output.division(mulres, 2);
		
	
	}

}
