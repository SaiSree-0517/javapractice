class Mdemo1
{
	public static void main(String args[])
	{
		try
		{
			int a,b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println(a/b);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
