import java.util.*;
class Mark
{

	public static void main(String[] args)
	{
	
	
		double a,b,c,d,e,total,per;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Marks Of First Subject: ");
		a = scan.nextDouble();
		System.out.print("Enter Marks Of Second Subject: ");
		b = scan.nextDouble();
		System.out.print("Enter Marks Of Third Subject: ");
		c = scan.nextDouble();
		System.out.print("Enter Marks Of Fourth Subject: ");
		d = scan.nextDouble();
		System.out.print("Enter Marks Of Fifth Subject: ");
		e = scan.nextDouble();
		total=a+b+c+d+e;
		if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35)
		{
			per=total/5;
			System.out.print("Percentage: "+per);
			if(per>=80)
			{
			System.out.println("Division: Distinction");
			}
			else if(per>=60 && per<80)
			{
			System.out.println("Division: First Division");
			}
			else if(per>=40 && per<60)
			{
			System.out.println("Division: Second Divsion");
			}
			else
			{
			System.out.println("Division: Third Division");
			}
			
			
		}
		else
		{
		System.out.println("FAILED");
		}
		
	}

}