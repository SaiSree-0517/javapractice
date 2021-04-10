import java.io.*;
import java.util.*;
class Characters1
{
	public static void main(String args[])
	{
		char t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the char:");
		t=s.next().charAt(0);
		if(t>=65&&t<=90)
		{
			System.out.print("Given element is a "+t+" alphbet ");
		}
		else if(t>=97&&t<=122)
		{	
			System.out.print("Given element is a "+t+" alphbet ");
		}
	        else if(t>=48&&t<=57)
		{
			System.out.print("Given element is a "+t+" numerical value ");
		}
		else if(t==32)
		{
			System.out.print("the char is space");
		}
		else
		{
			System.out.print("the char is special char");
		}
	}	
}