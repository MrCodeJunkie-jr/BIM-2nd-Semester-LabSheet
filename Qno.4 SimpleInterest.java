import java.util.*;
class SimpleInterest
	{
	 public static void main(String args[])
	
		{
			Scanner scan = new Scanner(System.in);
		 
			System.out.println("Enter principle,time and rate:");
			
			System.out.println("Principle:");
			double p=scan.nextDouble();
			
			System.out.println("Time:");
			double t=scan.nextDouble();
			
			System.out.println("Rate:");
			double r=scan.nextDouble();
			
			double SI=(p*t*r)/100;
			
			System.out.println("Simple Interest=" +SI);
		}
	}	
		
		
