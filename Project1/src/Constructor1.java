
public class Constructor1 {
	
	public Constructor1() {
		this(11,12,13,14);
		System.out.println("Default Constructor");
	}
	public Constructor1(int a) {
		this();
		System.out.println("One Paramenterized Constructor");
	}
	public Constructor1(int a,int b){
		this(11);
		System.out.println("Two Paramenterized Constructor");
	}
	public Constructor1(int a,int b,int c){
		this(15,21);
		System.out.println("Three Paramenterized Constructor");
	}
	public Constructor1(int a,int b,int c,int d){
		
		System.out.println("Four Paramenterized Constructor");
	}
	

	public static void main(String[] args) {
		Constructor1 obj = new Constructor1(2,3,4);

	}

}
