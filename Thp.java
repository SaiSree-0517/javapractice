import java.lang.Thread;
class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
			System.out.println("Good morning");
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			 System.out.println(e);
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("Hello");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException g)
		{
			System.out.println(g);
		}
	}
}
class Third extends Thread
{
	public void run()
	{
		try
		{
			for(int k=1;k<=3;k++)
			{
				System.out.println("welcome");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException g)
		{
			System.out.println(g);
		}
	}
}
class Thp
{
	public static void main(String args[])
	{
		First t1=new First();
		Second t2=new Second();
		Third t3=new Third();
		t1.start();
		t2.start();
		t3.start();
	}
}
