import java.lang.Thread;
class First implements Runnable
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
class Second implements Runnable
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
class Third implements Runnable
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
class Thp1
{
	public static void main(String args[])
	{
		First f=new First();
		Thread t1=new Thread(f);
		Second s=new Second();
		Thread t2=new Thread(s);
		Third t=new Third();
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
