//java program to add two complex numbers
import java.util.*;
class Complex
{
	double real,imag;
	Complex(double real, double imag)
	{
        	this.real = real;
        	this.imag = imag;
   	}
	void add(Complex c)
	{
		System.out.println("Sum="+(real+c.real)+"+i"+(imag+c.imag));
	}
}
class ComplexAdd
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double r,i;
		System.out.println("enter first complex number:");
		r=s.nextDouble();
		i=s.nextDouble();
		Complex c1=new Complex(r,i);
		System.out.println("enter second complex number:");
		r=s.nextDouble();
		i=s.nextDouble();
		Complex c2=new Complex(r,i);
		c1.add(c2);
		
	}
}
        