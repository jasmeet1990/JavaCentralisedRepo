package JavaPractice;

public class Super1Parent {

	
	public Super1Parent()
	{
		this(11,12,13);
		System.out.println("Parent Default Constructor");
	}
	
	public Super1Parent(int a)
	{
		this(11,12,13,14);
		System.out.println("Parent one parameterized Constructor");
	}
	
	public Super1Parent(int a,int b)
	{
		this(11);
		System.out.println("Parent two parameterized Constructor");
	}
	
	public Super1Parent(int a,int b,int c)
	{
		System.out.println("Parent three parameterized Constructor");
	}
	
	public Super1Parent(int a,int b,int c,int d)
	{
		this();
		System.out.println("Parent four parameterized Constructor");
	}
}
