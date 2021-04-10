package sai;
public class Factorial
{
	public void fact(int n)
	{
		int i,fact=1;
		for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("FACTORIAL="+fact);
	}
}
