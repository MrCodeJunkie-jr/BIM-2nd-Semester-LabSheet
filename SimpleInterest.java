import java.util.*;
class SimpleInterest
	{
	 public static void main(String args[])
	
		{
			Scanner scan = new Scanner(System.in);
			double p;
			double t;
			double r; 
			double SI;
			System.out.println("Enter principle,time and rate:");
			
			System.out.println("p:");
			p=scan.nextDouble();
			
			System.out.println("t:");
			t=scan.nextDouble();
			
			System.out.println("r:");
			r=scan.nextDouble();
			
			SI=(p*t*r)/100;
			
			System.out.println("Simple Interest=" +SI);
		}
	}	
		
		