package JavaPractice;

public class Super1Child extends Super1Parent {
	
	public Super1Child()
	{
		super(11,12);
		System.out.println("Child Default Constructor");
	}
	
	public Super1Child(int a)
	{
		this(11,12,13);
		System.out.println("Child one parameterized Constructor");
	}
	
	public Super1Child(int a,int b)
	{
		this(11);
		System.out.println("Child two parameterized Constructor");
	}
	
	public Super1Child(int a,int b,int c)
	{
		this(11,12,13,14);
		System.out.println("Child three parameterized Constructor");
	}
	
	public Super1Child(int a,int b,int c,int d)
	{
		this();
		System.out.println("Child four parameterized Constructor");
	}

	public static void main(String[] args) {
		Super1Child c = new Super1Child(10,11);

	}

}
