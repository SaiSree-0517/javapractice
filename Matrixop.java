 import java.util.*;
import java.lang.*;
class Matrixop
{
	public static void main(String args[])
	{
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};       
		int c[][]=new int[3][3];         
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]+=a[i][j]+b[i][j];
			}	
		}
		System.out.println("Sum of Matrix a and Matrix b :");
		for(int i=0;i<=2;i++)
		{
		for(int j=0;j<=2;j++)
			

{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		c[0][0]=0;
		System.out.println("Multiplication of Matrix a and Matrix b : ");	   
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				for(int k=0;k<3;k++)
				{    
					c[i][j]=c[i][j]+a[i][k]*b[k][j];     
				}  
				System.out.print(c[i][j]+" "); 
			}       
			System.out.println();
		}	
	}
}
