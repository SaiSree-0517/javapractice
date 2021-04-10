import java.util.*;
class Speed
{
	public static void main(String args[])
	{
		double a,b,c,d,e,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter speed of a :");
		a=s.nextDouble();
		System.out.println("Enter speed of b :");
		b=s.nextDouble();
		System.out.println("Enter speed of c :");
		c=s.nextDouble();
		System.out.println("Enter speed of d :");
		d=s.nextDouble();
		System.out.println("Enter speed of e :");
		e=s.nextDouble();
		avg=(a+b+c+d+e)/5;
		if(a>avg)
		{
			System.out.println("biker a qualified");
			System.out.println("speed of a="+a);
		}
		 if(b>avg)
		{
			System.out.println("biker b qualified");
			System.out.println("speed of b="+b);
		}
		 if(c>avg)
		{
			System.out.println("biker c qualified");
			System.out.println("speed of c="+c);
		}
		 if(d>avg)
		{
			System.out.println("biker d qualified");
			System.out.println("speed of d="+d);
		}
		if(e>avg)
		{
			System.out.println("biker e qualified");

			System.out.println("speed of e="+e);
		}
	}
}
