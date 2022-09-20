import java.util.*;
class Profile
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your Profile info:");
			
			System.out.println("Name:");
			String p=scan.nextLine();
			
			System.out.println("Gender:");
			String t=scan.nextLine();
			
			System.out.println("D.O.B:");
			String r=scan.nextLine();
			
			System.out.println("Your Name =" +p);
			System.out.println("Your Gender =" +t);
			System.out.println("Your D.O.B =" +r);
		}
	}	