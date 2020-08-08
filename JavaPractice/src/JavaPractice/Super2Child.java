package JavaPractice;

public class Super2Child extends Super2Parent {

	public void method() {
		System.out.println("Child default method");
			}

	public void method1(int a) {
		System.out.println("Child one parameterized method");
	}

	public void method2(int a, int b) {
		super.method3(11, 12, 13);
		super.method();
		super.method4(10, 11, 12, 14);
		super.method1(11);
		super.method2(11, 12);
		method();
		method1(11);
		method3(11, 14, 16);
		method1(11);
		System.out.println("Child two parameterized method");
	}

	public void method3(int a, int b, int c) {

		System.out.println("Child three parameterized method");
	}

	public void method4(int a, int b, int c, int d) {
		method();
		System.out.println("Child four parameterized method");
	}

	public static void main(String[] args) {
		Super2Child c = new Super2Child();
		c.method2(11, 12);
	}

}
