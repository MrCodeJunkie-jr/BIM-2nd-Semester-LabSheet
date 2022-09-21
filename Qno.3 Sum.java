import java.util.*;
class Sum
	{
	 public static void main(String args[])
	
		{
			Scanner scan = new Scanner(System.in);
			double a;
			double b;
			double sum;
			
			System.out.println("Enter any two numbers to add: ");
			
			System.out.println("First Number: ");
			a=scan.nextDouble();
			
			System.out.println("Second Number: ");
			b=scan.nextDouble();
			
			sum = a + b;
			
			System.out.println("Sum of two numbers =" +sum);
		}
	}
