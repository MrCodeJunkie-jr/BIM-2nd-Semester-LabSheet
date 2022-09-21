import java.util.*;
class Smallest
{

	public static void main(String[] args)
	{
	
	
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = scan.nextInt();
		System.out.print("Enter second number : ");
		b = scan.nextInt();
		System.out.print("Enter third number : ");
		c = scan.nextInt();
		if(a<b && a<c)
		{
			System.out.println(+a+" is Smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println(+b+" is Smallest");
		}
		else
		{
			System.out.println(+c+" is Smallest");
		}
	}

}