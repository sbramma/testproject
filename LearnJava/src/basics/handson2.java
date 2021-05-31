package basics;

public class handson2 {

	public static void main(String[] args) 
	{
		//java Conditional statements
		//if statement (if...esle , if ....elseif,...,else)
		int age = 16;
		if (age>=18)
		{
			System.out.println("Eligible for Voting");
		}
		else
			System.out.println("not eligible for voting");
		
		int i = 1;
		//while loop
		while (i<=10)
		{
			
			if((i % 2)==0)
			{
			System.out.println(i);
			}
			i++;
		}
		//do...while loop
		do 
		{
			System.out.println("not checked condition");
		}while (i==0);
		//for loop
		for (int j=1;j<10;j++)
		{
			System.out.println(j);
			if(j==5)
				break;
		}
	}

}
