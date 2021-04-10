import java.util.*;
class MarksException extends Exception
{
 	MarksException(String msg)
 	{
  		super(msg);
 	}
}
class Mdem
{
	public static void main(String args[])
	{
		try
		{
			int m;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the marks:");
			m=sc.nextInt();
			if(m>6)
				throw new MarksException("Marks should be greater than 6");
			else
				System.out.println("Assignment marks="+m);
		}
		catch(MarksException e)
		{
			System.out.println(e);
		}
	}
}
