import java.util.*;
class Greatest
{

	public static void main(String[] args)
	{
	
	
		int a,b,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = scan.nextInt();
		System.out.print("Enter second number : ");
		b = scan.nextInt();
		if(a>b)
		{
			System.out.println(+a+" is Greatest");
		}
		else
		{
			System.out.println(+b+" is Greatest");
		}
	}

}