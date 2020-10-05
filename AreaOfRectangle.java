import java.lang.*;
import java.util.*;
class Rectangle
{
	float l,b;
	Rectangle(float l,float b)
	{
		this.l=l;
		this.b=b;
		
	}
	void display()
	{
		System.out.print("Area="+(l*b));
	}

}
 class AreaOfRectangle
{
    
	public static void main(String args[])

    	{

       		Rectangle r=new Rectangle(3.5f,7.5f);
		r.display();
		
	
}

}