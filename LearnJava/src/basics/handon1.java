package basics;

public class handon1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//hands-on Java Operators 
		//to print a statement
		System.out.println("Hello World \n Sathish Started Preparing");
		int a =74;
		int b =36;
		//to perform some operations on the declared variables 
		System.out.println("sunm of numbers "+ (a+b));
		//swapping the values using a dummy variable
		System.out.println("before Swap\n a="+ a +" and b="+ b);
		int c =b;
		b=a;
		a=c;
		System.out.println("after Swap\n a="+ a +" and b="+ b);
		

	}

}
