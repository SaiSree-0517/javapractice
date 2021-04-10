import java.io.*;
import java.util.*;
class Amstrong
{
public static void main(String args[])
{
int n,rem,rev=0,temp,x=0,y;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
temp=n;
y=n;
while(n>0)
{
n=n/10;
x++;
}
while(temp>0)
{
rem=temp%10;
rev=rev+(int)Math.pow(rem,x);
temp=temp/10;
}
if(y==rev)
{
System.out.print("AMSTRONG NUMBER");
}
else
{
System.out.print("NOT AMSTRONG NUMBER");
}
}
}
