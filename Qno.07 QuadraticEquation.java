import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String args[]) 
    {
        double a,b,c,x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = scan.nextDouble();
        System.out.print("Enter B : ");
        b = scan.nextDouble();
        System.out.print("Enter C : ");
        c = scan.nextDouble();
        scan.close();
	double d= b * b - 4.0 * a * c;  
        x= ((-b)+(Math.pow(d,0.5)))/(2.0*a);
	y= ((-b)-(Math.pow(d,0.5)))/(2.0*a);
        System.out.printf("Quadratic root are:\n");
	System.out.printf(" %.2f \n",x);
	
    }
}
