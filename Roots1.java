import java.util.*;
import java.lang.*;
import java.io.*;
class Roots1
{
	public static void main(String args[])
	{
		double a,b,c,d,r1,r2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=s.nextDouble();
		System.out.println("Enter b value:");
		b=s.nextDouble();
		System.out.println("Enter c value:");
		c=s.nextDouble();
		d=Math.pow(b,2)-4*a*c;
		if(d>0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("ROOTS ARE DISTINCT:");
			System.out.println("ROOT1="+r1+"\tROOT2="+r2);
		}
		else if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.println("ROOTS ARE EQUAL:");
			System.out.println("ROOT1="+r1+"\tROOT2="+r2);
		}
		else
		{
			System.out.print("ROOTS ARE IMAGINARY");
		}
	}
}
