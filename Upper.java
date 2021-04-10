import java.io.*;
import java.util.*;
class Upper
{
	public static void main(String args[])
	{
		char t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the char:");
		t=s.next().charAt(0);
		if(t>=65&&t<=90)
		{
			t=(char)(t+32);
		}
		System.out.print("\nlower="+t);
	}	
}