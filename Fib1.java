import java.io.*;
import java.util.*;
class Fib1
{
public static void main(String args[])
{
int a=0,b=1,c,n,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit:");
n=s.nextInt();
System.out.println("THE SERIES");
c=a+b;
while(c<=n)
{
c=a+b;
a=b;
b=c;
System.out.print(c+" ");
if(c%2==0)
{
sum=sum+c;
}
}
System.out.print("\nSUM="+sum);
}	
}
