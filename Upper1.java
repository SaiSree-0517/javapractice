import java.io.*;
import java.util.*;
class Upper1
{
	public static void main(String args[])
	{
		char t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the char:");
		t=s.next().charAt(0);
		if(t>=65&&t<=90)
		{
			System.out.print("the char "+t+"is upper");
		}
		else
		{
			System.out.print("the char "+t+"is not upper");
		}
	}	
}