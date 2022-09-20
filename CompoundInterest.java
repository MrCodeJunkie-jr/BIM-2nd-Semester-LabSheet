import java.util.*;
class CompoundInterest
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter principle,time and rate:");
			
			System.out.println("Principle:");
			double p=scan.nextDouble();
			
			System.out.println("Time:");
			double t=scan.nextDouble();
			
			System.out.println("Rate:");
			double r=scan.nextDouble();
			
			double CI = p*Math.pow(1+r/100,t);
			
			System.out.println("Compound Interest=" +CI);
		}
	}	