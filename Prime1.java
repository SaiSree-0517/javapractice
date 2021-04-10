import java.io.*;
import java.util.*;
class Prime1
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
	int c=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			c++;
		}
	}
	if(c==2)
	{
		System.out.println(i);
	}
}
}
}
