
public class Constructor2 {	
	public void method() {
		System.out.println("Default menthod");
	}
	public void method1(int a) {
		System.out.println("One Parameterized menthod");
	}
	public void method2(int a,int b) {
		System.out.println("Two Parameterized menthod");
	}
	public void method3(int a,int b,int c) {
		System.out.println("Three Parameterized menthod");
		method();
		method1(11);
		method2(11,12);
		method4(11,12,13,14);
	}
	public void method4(int a,int b ,int c,int d) {
		System.out.println("Four Parameterized menthod");
	}
	public static void main(String[] args) {
		Constructor2 obj = new Constructor2();
		obj.method3(11,12,13);
	}

}
