import sai.Factorial;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Factorial f=new Factorial();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		f.fact(n);
	}
}
