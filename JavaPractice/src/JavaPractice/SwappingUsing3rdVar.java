package JavaPractice;

public class SwappingUsing3rdVar {

	public static void main(String[] args) {
	int a=10;
	int b = 20;
	int c;
	
	System.out.println("Value of a before swapping "+a );
	System.out.println("Value of b before swapping "+b );
	c=a;
	a=b;
	b=c;
	
	
	System.out.println("Value of a after swapping "+a );
	System.out.println("Value of b after swapping "+b );
	

	}

}
